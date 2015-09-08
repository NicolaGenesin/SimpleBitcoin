package com.z1911.bitcoin.Activity;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AbsListView;

import com.github.ksoichiro.android.observablescrollview.ObservableRecyclerView;
import com.github.ksoichiro.android.observablescrollview.ObservableScrollViewCallbacks;
import com.nineoldandroids.view.ViewHelper;
import com.z1911.bitcoin.Adapter.ExchangeListAdapter;
import com.z1911.bitcoin.BitcoinApplication;
import com.z1911.bitcoin.Model.Bitcoin;
import com.z1911.bitcoin.Model.OverallExchangeRate;
import com.z1911.bitcoin.R;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class RootActivity extends ScrollableActivity<ObservableRecyclerView> implements ObservableScrollViewCallbacks {

    private static List<OverallExchangeRate.ExchangeRate> mExchangeRates= new ArrayList<>();
    private  ExchangeListAdapter mAdapter ;
    private View headerView;
    private ObservableRecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        BitcoinApplication.getApi().getExchangeRates(new Callback<OverallExchangeRate>() {
            @Override
            public void success(OverallExchangeRate overallExchangeRate, Response response) {
                mExchangeRates = overallExchangeRate.getExchangeRates();
                mAdapter = new ExchangeListAdapter(mExchangeRates, headerView);
                recyclerView.setAdapter(mAdapter);
            }

            @Override
            public void failure(RetrofitError error) {

            }
        });
    }

    @Override
    protected ObservableRecyclerView createScrollable() {

        recyclerView = (ObservableRecyclerView) findViewById(R.id.scroll);
        recyclerView.setScrollViewCallbacks(this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(false);
        recyclerView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
//                if (newState == AbsListView.OnScrollListener.SCROLL_STATE_FLING) {
//                    mAdapter.isScrolling(true);
//                } else {
//                    mAdapter.isScrolling(false);
//                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });

        setDummyDataWithHeader(recyclerView, mFlexibleSpaceImageHeight);
        return recyclerView;
    }


    protected void setDummyDataWithHeader(RecyclerView recyclerView, int headerHeight) {
        headerView = new View(this);
        headerView.setLayoutParams(new AbsListView.LayoutParams(AbsListView.LayoutParams.MATCH_PARENT, headerHeight));
        headerView.setMinimumHeight(headerHeight);
        // This is required to disable header's list selector effect
        headerView.setClickable(true);
        setDummyDataWithHeader(recyclerView, headerView);
    }

    protected void setDummyDataWithHeader(RecyclerView recyclerView, View headerView) {
        mExchangeRates.add(new OverallExchangeRate.AUDExchangeRate());
        mExchangeRates.add(new OverallExchangeRate.AUDExchangeRate());
        mExchangeRates.add(new OverallExchangeRate.AUDExchangeRate());
        mExchangeRates.add(new OverallExchangeRate.AUDExchangeRate());

        mAdapter = new ExchangeListAdapter(mExchangeRates, headerView);
        recyclerView.setAdapter(mAdapter);
    }

    @Override
    protected void updateViews(int scrollY, boolean animated) {
        super.updateViews(scrollY, animated);

        // Translate list background
        ViewHelper.setTranslationY(mListBackgroundView, ViewHelper.getTranslationY(mHeader));
    }
}
