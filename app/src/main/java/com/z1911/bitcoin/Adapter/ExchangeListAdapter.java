package com.z1911.bitcoin.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.z1911.bitcoin.Model.OverallExchangeRate;
import com.z1911.bitcoin.R;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;


/**
 * Created by Nicola Genesin on 27/07/2015.
 * Copyright (C) 2015 1911.
 */
public class ExchangeListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private static final int VIEW_TYPE_HEADER = 0;
    private static final int VIEW_TYPE_ITEM = 1;
    private final View mHeaderView;
    private List<OverallExchangeRate.ExchangeRate> mExchangeRateList;
    private List<Integer> imagesList;
    private boolean isScrolling;


    public ExchangeListAdapter(List<OverallExchangeRate.ExchangeRate> itemsData, View headerView) {
        this.mExchangeRateList = itemsData;
        this.mHeaderView = headerView;
    }

    @Override
    public int getItemViewType(int position) {
        return (position == 0) ? VIEW_TYPE_HEADER : VIEW_TYPE_ITEM;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {

        if (viewType == VIEW_TYPE_HEADER) {
            return new EmptyHeaderViewHolder(mHeaderView);
        } else {
            View itemLayoutView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row_exchange_quote, parent, false);

            return new ViewHolder(itemLayoutView);
        }
    }

    @Override
    public void onBindViewHolder(final RecyclerView.ViewHolder viewHolder, final int position) {

        if (viewHolder instanceof ViewHolder) {
            ViewHolder holder = ((ViewHolder) viewHolder);

            OverallExchangeRate.ExchangeRate rate = mExchangeRateList.get(position-1);

            holder.buy.setText(Double.toString(rate.getBuy()));
            holder.sell.setText(Double.toString(rate.getSell()));
            holder.currency.setText(rate.getCurrency());
        }
    }


    // Return the size of your mExchangeRateList (invoked by the layout manager)
    @Override
    public int getItemCount() {
        if (mHeaderView == null) {
            return mExchangeRateList.size();
        } else {
            return mExchangeRateList.size() + 1;
        }
    }

    // inner class to hold a reference to each item of RecyclerView
    public static class ViewHolder extends RecyclerView.ViewHolder {
        @Bind(R.id.currency)
        TextView currency;
        @Bind(R.id.buy)
        TextView buy;
        @Bind(R.id.sell)
        TextView sell;
        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            ButterKnife.bind(this,itemLayoutView);
        }
    }


    static class EmptyHeaderViewHolder extends RecyclerView.ViewHolder {
        public EmptyHeaderViewHolder(View view) {
            super(view);
        }
    }

}
