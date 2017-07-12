package com.example.cf.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Author: SongCHao
 * Date: 2017/7/12/09:25
 * Email: 15704762346@163.com
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        @SerializedName("aqi")
        public String aqi;
        @SerializedName("pm25")
        public String pm25;
    }
}
