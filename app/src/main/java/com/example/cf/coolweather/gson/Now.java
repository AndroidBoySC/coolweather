package com.example.cf.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Author: SongCHao
 * Date: 2017/7/12/09:29
 * Email: 15704762346@163.com
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("txt")
        public String info;
    }
}
