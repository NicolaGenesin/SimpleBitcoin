package com.z1911.bitcoin.Model;

import java.util.List;

/**
 * Created by Nicola Genesin on 08/09/2015.
 * Copyright (C) 2015 1911.
 */
public class Chart {

    /**
     * values : [{"x":1410200105,"y":6.31197261975E9},{"x":1410286505,"y":6179355602}]
     */

    private List<ValuesEntity> values;

    public void setValues(List<ValuesEntity> values) {
        this.values = values;
    }

    public List<ValuesEntity> getValues() {
        return values;
    }

    public static class ValuesEntity {
        /**
         * x : 1410200105
         * y : 6.31197261975E9
         */

        private int x;
        private double y;

        public void setX(int x) {
            this.x = x;
        }

        public void setY(double y) {
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public double getY() {
            return y;
        }
    }
}
