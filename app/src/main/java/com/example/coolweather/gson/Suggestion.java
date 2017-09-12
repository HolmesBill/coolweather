package com.example.coolweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 52656 on 2017/8/31.
 */

public class Suggestion {
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

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;
}
