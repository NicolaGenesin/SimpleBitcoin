package com.z1911.bitcoin.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nicola Genesin on 07/09/2015.
 * Copyright (C) 2015 1911.
 */
public class OverallExchangeRate {


    /**
     * USD : {"last":240.5,"buy":240.4,"sell":240.5,"symbol":"$"}
     * ISK : {"last":31157.74,"buy":31144.78,"sell":31157.74,"symbol":"kr"}
     * HKD : {"last":1863.9,"buy":1863.13,"sell":1863.9,"symbol":"$"}
     * TWD : {"last":7851.48,"buy":7848.21,"sell":7851.48,"symbol":"NT$"}
     * CHF : {"last":233.96,"buy":233.86,"sell":233.96,"symbol":"CHF"}
     * EUR : {"last":215.8,"buy":215.71,"sell":215.8,"symbol":"\u20ac"}
     * DKK : {"last":1609.02,"buy":1608.35,"sell":1609.02,"symbol":"kr"}
     * CLP : {"last":166286.51,"buy":166217.37,"sell":166286.51,"symbol":"$"}
     * CAD : {"last":318.86,"buy":318.73,"sell":318.86,"symbol":"$"}
     * CNY : {"last":1528.65,"buy":1528.01,"sell":1528.65,"symbol":"¥"}
     * THB : {"last":8639.86,"buy":8636.27,"sell":8639.86,"symbol":"฿"}
     * AUD : {"last":347.71,"buy":347.57,"sell":347.71,"symbol":"$"}
     * SGD : {"last":341.99,"buy":341.85,"sell":341.99,"symbol":"$"}
     * KRW : {"last":287078.84,"buy":286959.47,"sell":287078.84,"symbol":"\u20a9"}
     * JPY : {"last":28664.79,"buy":28652.87,"sell":28664.79,"symbol":"¥"}
     * PLN : {"last":911.19,"buy":910.81,"sell":911.19,"symbol":"zł"}
     * GBP : {"last":158.2,"buy":158.14,"sell":158.2,"symbol":"£"}
     * SEK : {"last":2031.91,"buy":2031.07,"sell":2031.91,"symbol":"kr"}
     * NZD : {"last":382.61,"buy":382.45,"sell":382.61,"symbol":"$"}
     * BRL : {"last":916.5,"buy":916.12,"sell":916.5,"symbol":"R$"}
     * RUB : {"last":16247.95,"buy":16241.2,"sell":16247.95,"symbol":"RUB"}
     */

    public USDExchangeRate USD;
    public ISKExchangeRate ISK;
    public HKDExchangeRate HKD;
    public TWDExchangeRate TWD;
    public CHFExchangeRate CHF;
    public EURExchangeRate EUR;
    public DKKExchangeRate DKK;
    public CLPExchangeRate CLP;
    public CADExchangeRate CAD;
    public CNYExchangeRate CNY;
    public THBExchangeRate THB;
    public AUDExchangeRate AUD;
    public SGDExchangeRate SGD;
    public KRWExchangeRate KRW;
    public JPYExchangeRate JPY;
    public PLNExchangeRate PLN;
    public GBPExchangeRate GBP;
    public SEKExchangeRate SEK;
    public NZDExchangeRate NZD;
    public BRLExchangeRate BRL;
    public RUBExchangeRate RUB;

    public List<ExchangeRate> getExchangeRates() {
        List<ExchangeRate> exchangeRates = new ArrayList<>();
        USD.setCurrency("USD");
        ISK.setCurrency("ISK");
        HKD.setCurrency("HKD");
        TWD.setCurrency("TWD");
        CHF.setCurrency("CHF");
        EUR.setCurrency("EUR");
        DKK.setCurrency("DKK");
        CLP.setCurrency("CLP");
        CAD.setCurrency("CAD");
        CNY.setCurrency("CNY");
        THB.setCurrency("THB");
        AUD.setCurrency("AUD");
        SGD.setCurrency("SGD");
        KRW.setCurrency("KRW");
        JPY.setCurrency("JPY");
        PLN.setCurrency("PLN");
        GBP.setCurrency("GBP");
        SEK.setCurrency("SEK");
        NZD.setCurrency("NZD");
        BRL.setCurrency("BRL");
        RUB.setCurrency("RUB");
        exchangeRates.add(USD);
        exchangeRates.add(ISK);
        exchangeRates.add(HKD);
        exchangeRates.add(TWD);
        exchangeRates.add(CHF);
        exchangeRates.add(EUR);
        exchangeRates.add(DKK);
        exchangeRates.add(CLP);
        exchangeRates.add(CAD);
        exchangeRates.add(CNY);
        exchangeRates.add(THB);
        exchangeRates.add(AUD);
        exchangeRates.add(SGD);
        exchangeRates.add(KRW);
        exchangeRates.add(JPY);
        exchangeRates.add(PLN);
        exchangeRates.add(GBP);
        exchangeRates.add(SEK);
        exchangeRates.add(NZD);
        exchangeRates.add(BRL);
        exchangeRates.add(RUB);
        return exchangeRates;
    }

    public USDExchangeRate getUSD() {
        return USD;
    }

    public ISKExchangeRate getISK() {
        return ISK;
    }

    public HKDExchangeRate getHKD() {
        return HKD;
    }

    public TWDExchangeRate getTWD() {
        return TWD;
    }

    public CHFExchangeRate getCHF() {
        return CHF;
    }

    public EURExchangeRate getEUR() {
        return EUR;
    }

    public DKKExchangeRate getDKK() {
        return DKK;
    }

    public CLPExchangeRate getCLP() {
        return CLP;
    }

    public CADExchangeRate getCAD() {
        return CAD;
    }

    public CNYExchangeRate getCNY() {
        return CNY;
    }

    public THBExchangeRate getTHB() {
        return THB;
    }

    public AUDExchangeRate getAUD() {
        return AUD;
    }

    public SGDExchangeRate getSGD() {
        return SGD;
    }

    public KRWExchangeRate getKRW() {
        return KRW;
    }

    public JPYExchangeRate getJPY() {
        return JPY;
    }

    public PLNExchangeRate getPLN() {
        return PLN;
    }

    public GBPExchangeRate getGBP() {
        return GBP;
    }

    public SEKExchangeRate getSEK() {
        return SEK;
    }

    public NZDExchangeRate getNZD() {
        return NZD;
    }

    public BRLExchangeRate getBRL() {
        return BRL;
    }

    public RUBExchangeRate getRUB() {
        return RUB;
    }

    public static class ExchangeRate {
        /**
         * last : 240.5
         * buy : 240.4
         * sell : 240.5
         * symbol : $
         */

        private String currency;
        private double last;
        private double buy;
        private double sell;
        private String symbol;

        public double getLast() {
            return last;
        }

        public void setLast(double last) {
            this.last = last;
        }

        public double getBuy() {
            return buy;
        }

        public void setBuy(double buy) {
            this.buy = buy;
        }

        public double getSell() {
            return sell;
        }

        public void setSell(double sell) {
            this.sell = sell;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }
        public String getCurrency() {
            return currency;
        }
    }

    public static class USDExchangeRate extends ExchangeRate {
    }

    public static class ISKExchangeRate extends ExchangeRate {
    }

    public static class HKDExchangeRate extends ExchangeRate {
    }

    public static class TWDExchangeRate extends ExchangeRate {
    }

    public static class CHFExchangeRate extends ExchangeRate {
    }

    public static class EURExchangeRate extends ExchangeRate {
    }

    public static class DKKExchangeRate extends ExchangeRate {
    }

    public static class CLPExchangeRate extends ExchangeRate {
    }

    public static class CADExchangeRate extends ExchangeRate {
    }

    public static class CNYExchangeRate extends ExchangeRate {
    }

    public static class THBExchangeRate extends ExchangeRate {
    }

    public static class AUDExchangeRate extends ExchangeRate {
    }

    public static class SGDExchangeRate extends ExchangeRate {
    }

    public static class KRWExchangeRate extends ExchangeRate {
    }

    public static class JPYExchangeRate extends ExchangeRate {
    }

    public static class PLNExchangeRate extends ExchangeRate {
    }

    public static class GBPExchangeRate extends ExchangeRate {
    }

    public static class SEKExchangeRate extends ExchangeRate {
    }

    public static class NZDExchangeRate extends ExchangeRate {
    }

    public static class BRLExchangeRate extends ExchangeRate {
    }

    public static class RUBExchangeRate extends ExchangeRate {
    }
}
