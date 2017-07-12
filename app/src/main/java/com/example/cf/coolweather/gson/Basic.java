package com.example.cf.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Author: SongCHao
 * Date: 2017/7/12/09:21
 * Email: 15704762346@163.com
 */

public class Basic {
    //对应的值是json中的字段名
    @SerializedName("city")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }
}
