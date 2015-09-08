package com.z1911.bitcoin.Activity;

import android.os.Bundle;
import android.support.v4.view.ViewCompat;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.z1911.bitcoin.Activity.Base.BaseActivity;
import com.z1911.bitcoin.BitcoinApplication;
import com.z1911.bitcoin.Const;
import com.z1911.bitcoin.Model.Bitcoin;
import com.z1911.bitcoin.Model.Chart;
import com.z1911.bitcoin.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import lecho.lib.hellocharts.model.Line;
import lecho.lib.hellocharts.model.LineChartData;
import lecho.lib.hellocharts.model.PointValue;
import lecho.lib.hellocharts.view.LineChartView;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by Nicola Genesin on 07/09/2015.
 * Copyright (C) 2015 1911.
 */
public class SummaryActivity extends BaseActivity {
    @Bind(R.id.image)
    ImageView mBitcoinImage;
    @Bind(R.id.chart_layout)
    RelativeLayout mChartLayout;
    LineChartView mChart;
    @Bind(R.id.blockSizeValue)
    TextView blockSizeValue;
    @Bind(R.id.difficulty)
    TextView difficulty;
    @Bind(R.id.minersRevenue)
    TextView minersRevenue;
    @Bind(R.id.blocksMined)
    TextView blocksMined;

    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_summary);
        ButterKnife.bind(this);
        performTransitions();
        mBitcoinImage.setImageResource(R.drawable.bitcoin);

        BitcoinApplication.getApi().getBitcoinInfo(new Callback<Bitcoin>() {
            @Override
            public void success(Bitcoin bitcoin, Response response) {
                blockSizeValue.setText(Integer.toString(bitcoin.getBlocks_size()));
                difficulty.setText(Double.toString(bitcoin.getDifficulty()));
                minersRevenue.setText(Double.toString(bitcoin.getMiners_revenue_btc()));
                blocksMined.setText(Integer.toString(bitcoin.getN_blocks_mined()));
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });

        BitcoinApplication.getApi().getChartValues(new Callback<Chart>() {
            @Override
            public void success(Chart chart, Response response) {

                List<PointValue> values = new ArrayList<PointValue>();

                for (int i = 0; i < chart.getValues().size() - 1; i++) {
                    Chart.ValuesEntity ve = chart.getValues().get(i);

                    values.add(new PointValue(ve.getX(), (float) ve.getY()));
                }

                Line line = new Line(values)
                        .setStrokeWidth(1)
                        .setColor(getResources().getColor(R.color.darkbluevulcan))
                        .setHasPoints(false);
                List<Line> lines = new ArrayList<>();
                lines.add(line);

                LineChartData data = new LineChartData();
                data.setLines(lines);

                mChart = new LineChartView(SummaryActivity.this);
                mChart.setLineChartData(data);
                mChartLayout.addView(mChart);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });

    }

    private void performTransitions() {
        ViewCompat.setTransitionName(mBitcoinImage, Const.EXTRA_IMAGE);
    }
}
