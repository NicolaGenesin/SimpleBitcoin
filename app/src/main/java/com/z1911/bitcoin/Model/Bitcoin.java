package com.z1911.bitcoin.Model;

/**
 * Created by Nicola Genesin on 07/09/2015.
 * Copyright (C) 2015 1911.
 */
public class Bitcoin {
    /**
     * n_btc_mined : 780000000000
     * market_cap : 9.622227958162625E7
     * total_fees_btc : 2252128249
     * total_btc_sent : 747456945221033
     * minutes_between_blocks : 9.230769230769232
     * market_price_usd : 9.857426146006336
     * miners_operating_margin : 48
     * electricity_cost_usd : 39755.97274663426
     * hash_rate : 16989.731943006092
     * estimated_transaction_volume_usd : 3744528.558883145
     * miners_revenue_usd : 77104.78731406156
     * blocks_size : 15503304
     * n_blocks_total : 195228
     * difficulty : 2190865.970102852
     * timestamp : 1345681034495
     * miners_revenue_btc : 7822
     * n_blocks_mined : 156
     * trade_volume_usd : 660214.3677100714
     * electricity_consumption : 265039.81831089506
     * estimated_btc_sent : 37986879165209
     * n_tx : 37320
     * trade_volume_btc : 66973.41726509096
     */

    private long n_btc_mined;
    private double market_cap;
    private long total_fees_btc;
    private long total_btc_sent;
    private double minutes_between_blocks;
    private double market_price_usd;
    private int miners_operating_margin;
    private double electricity_cost_usd;
    private double hash_rate;
    private double estimated_transaction_volume_usd;
    private double miners_revenue_usd;
    private int blocks_size;
    private int n_blocks_total;
    private double difficulty;
    private long timestamp;
    private int miners_revenue_btc;
    private int n_blocks_mined;
    private double trade_volume_usd;
    private double electricity_consumption;
    private long estimated_btc_sent;
    private int n_tx;
    private double trade_volume_btc;

    public void setN_btc_mined(long n_btc_mined) {
        this.n_btc_mined = n_btc_mined;
    }

    public void setMarket_cap(double market_cap) {
        this.market_cap = market_cap;
    }

    public void setTotal_fees_btc(long total_fees_btc) {
        this.total_fees_btc = total_fees_btc;
    }

    public void setTotal_btc_sent(long total_btc_sent) {
        this.total_btc_sent = total_btc_sent;
    }

    public void setMinutes_between_blocks(double minutes_between_blocks) {
        this.minutes_between_blocks = minutes_between_blocks;
    }

    public void setMarket_price_usd(double market_price_usd) {
        this.market_price_usd = market_price_usd;
    }

    public void setMiners_operating_margin(int miners_operating_margin) {
        this.miners_operating_margin = miners_operating_margin;
    }

    public void setElectricity_cost_usd(double electricity_cost_usd) {
        this.electricity_cost_usd = electricity_cost_usd;
    }

    public void setHash_rate(double hash_rate) {
        this.hash_rate = hash_rate;
    }

    public void setEstimated_transaction_volume_usd(double estimated_transaction_volume_usd) {
        this.estimated_transaction_volume_usd = estimated_transaction_volume_usd;
    }

    public void setMiners_revenue_usd(double miners_revenue_usd) {
        this.miners_revenue_usd = miners_revenue_usd;
    }

    public void setBlocks_size(int blocks_size) {
        this.blocks_size = blocks_size;
    }

    public void setN_blocks_total(int n_blocks_total) {
        this.n_blocks_total = n_blocks_total;
    }

    public void setDifficulty(double difficulty) {
        this.difficulty = difficulty;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public void setMiners_revenue_btc(int miners_revenue_btc) {
        this.miners_revenue_btc = miners_revenue_btc;
    }

    public void setN_blocks_mined(int n_blocks_mined) {
        this.n_blocks_mined = n_blocks_mined;
    }

    public void setTrade_volume_usd(double trade_volume_usd) {
        this.trade_volume_usd = trade_volume_usd;
    }

    public void setElectricity_consumption(double electricity_consumption) {
        this.electricity_consumption = electricity_consumption;
    }

    public void setEstimated_btc_sent(long estimated_btc_sent) {
        this.estimated_btc_sent = estimated_btc_sent;
    }

    public void setN_tx(int n_tx) {
        this.n_tx = n_tx;
    }

    public void setTrade_volume_btc(double trade_volume_btc) {
        this.trade_volume_btc = trade_volume_btc;
    }

    public long getN_btc_mined() {
        return n_btc_mined;
    }

    public double getMarket_cap() {
        return market_cap;
    }

    public long getTotal_fees_btc() {
        return total_fees_btc;
    }

    public long getTotal_btc_sent() {
        return total_btc_sent;
    }

    public double getMinutes_between_blocks() {
        return minutes_between_blocks;
    }

    public double getMarket_price_usd() {
        return market_price_usd;
    }

    public int getMiners_operating_margin() {
        return miners_operating_margin;
    }

    public double getElectricity_cost_usd() {
        return electricity_cost_usd;
    }

    public double getHash_rate() {
        return hash_rate;
    }

    public double getEstimated_transaction_volume_usd() {
        return estimated_transaction_volume_usd;
    }

    public double getMiners_revenue_usd() {
        return miners_revenue_usd;
    }

    public int getBlocks_size() {
        return blocks_size;
    }

    public int getN_blocks_total() {
        return n_blocks_total;
    }

    public double getDifficulty() {
        return difficulty;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public int getMiners_revenue_btc() {
        return miners_revenue_btc;
    }

    public int getN_blocks_mined() {
        return n_blocks_mined;
    }

    public double getTrade_volume_usd() {
        return trade_volume_usd;
    }

    public double getElectricity_consumption() {
        return electricity_consumption;
    }

    public long getEstimated_btc_sent() {
        return estimated_btc_sent;
    }

    public int getN_tx() {
        return n_tx;
    }

    public double getTrade_volume_btc() {
        return trade_volume_btc;
    }
}
