package com.example.coolweather.gson;

/**
 * Created by jsllx on 2018/1/4.
 */



import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}


