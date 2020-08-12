package com.geekbrains.myweatherv3;

import android.graphics.drawable.Drawable;

public class DataClass {
    String textDay;
    String texTemptDay;
    Drawable drawableDay;
    String texTemptNight;
    Drawable drawableNight;

    public DataClass(String textDay, String texTemptDay, Drawable drawableDay, String texTemptNight, Drawable drawableNight) {
        this.textDay = textDay;
        this.texTemptDay = texTemptDay;
        this.drawableDay = drawableDay;
        this.texTemptNight = texTemptNight;
        this.drawableNight = drawableNight;
    }
}
