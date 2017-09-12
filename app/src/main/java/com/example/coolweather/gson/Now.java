package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 52656 on 2017/8/31.
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
