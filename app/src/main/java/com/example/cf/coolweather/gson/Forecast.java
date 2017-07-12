package com.example.cf.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Author: SongCHao
 * Date: 2017/7/12/09:37
 * Email: 15704762346@163.com
 */

public class Forecast {
    @SerializedName("date")
    public String date;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public class Temperature{
        @SerializedName("max")
        public String max;
        @SerializedName("min")
        public String min;
    }
    public class More{
        @SerializedName("txt_d")
        public String info;
    }
}
