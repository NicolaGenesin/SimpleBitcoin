package com.z1911.bitcoin;

import android.app.Application;

import com.z1911.bitcoin.Network.IBlockChain;

import retrofit.RestAdapter;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by Nicola Genesin on 07/09/2015.
 * Copyright (C) 2015 1911.
 */
public class BitcoinApplication extends Application {

    private static IBlockChain mApi;

    @Override
    public void onCreate() {
        super.onCreate();
        setUpApi();
        setUpFont();
    }

    private void setUpApi() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(Const.BLOCK_CHAIN_API_URL)
                .build();

        mApi = restAdapter.create(IBlockChain.class);
    }

    public static IBlockChain getApi(){
        return mApi;
    }

    private void setUpFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                        .setDefaultFontPath("fonts/lig.otf")
                        .setFontAttrId(R.attr.fontPath)
                        .build()
        );
    }

}
