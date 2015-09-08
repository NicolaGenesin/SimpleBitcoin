package com.z1911.bitcoin.Network;

import com.z1911.bitcoin.Model.Bitcoin;
import com.z1911.bitcoin.Model.Chart;
import com.z1911.bitcoin.Model.OverallExchangeRate;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Created by Nicola Genesin on 07/09/2015.
 * Copyright (C) 2015 1911.
 */
public interface IBlockChain {
    @GET("/it/ticker")
    void getExchangeRates(Callback<OverallExchangeRate> oer);

    @GET("/it/stats?format=json")
    void getBitcoinInfo(Callback<Bitcoin> b);

    @GET("/it/charts/market-cap?showDataPoints=false&timespan=&show_header=true&daysAverageString=1&scale=0&format=json&address=")
    void getChartValues(Callback<Chart> b);

    //todo build using retrofit query
}

