package com.vinctor.vchartviews.bar.multi;

/**
 * Created by Vinctor on 2017/4/10.
 */

public class SingleData {
    int num;
    int barColor;
    int barStrokeColor;

    public SingleData(int num, int barColor) {
        this.num = num;
        this.barColor = barColor;
        this.barStrokeColor = barColor;
    }

    public SingleData(int num, int barColor, int barStrokeColor) {
        this.num = num;
        this.barColor = barColor;
        this.barStrokeColor = barStrokeColor;
    }

    public int getNum() {
        return num;
    }

    public int getBarColor() {
        return barColor;
    }

    public int getBarStrokeColor() {
        return barStrokeColor;
    }
}
