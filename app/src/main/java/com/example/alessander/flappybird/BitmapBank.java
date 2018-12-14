package com.example.alessander.flappybird;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {

    Bitmap background;

    public BitmapBank(Resources res) {
        background = BitmapFactory.decodeResource(res, R.drawable.background);
    }

    //Return background bitmap
    public Bitmap getBackground() {
        return background;
    }

    //Return background width
    public int getBackgroundWidth() {
        return background.getWidth();
    }

    //Return background height
    public int getBackgroundHeight() {
        return background.getHeight();
    }
}
