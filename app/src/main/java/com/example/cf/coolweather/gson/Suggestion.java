package com.example.cf.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Author: SongCHao
 * Date: 2017/7/12/09:33
 * Email: 15704762346@163.com
 */

public class Suggestion {
    @SerializedName("comf")
    public Comfort comfort;
    @SerializedName("cw")
    public CarWash carWash;
    public Sport sport;
    public class Comfort{
        @SerializedName("txt")
        public String info;
    }
    public class CarWash{
        @SerializedName("txt")
        public String info;
    }
    public class Sport{
        @SerializedName("txt")
        public String info;
    }
}
