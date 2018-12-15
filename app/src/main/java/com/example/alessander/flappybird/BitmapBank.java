package com.example.alessander.flappybird;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class BitmapBank {

    Bitmap background;

    public BitmapBank(Resources res) {
        background = BitmapFactory.decodeResource(res, R.drawable.background);
        background = scaleImage(background);
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

    public Bitmap scaleImage(Bitmap bitmap) {
        float widthHeightRatio = getBackgroundWidth() / getBackgroundHeight();
        /*
        * We'll multiply widthHeightRatio with screenHeight to get scaled width of the bitmap
        * Then call createScaledBitmap() to create a new bitmap, scaled from an existing bitmap, when possible
        * */
        int backgroundScaledWidth = (int) widthHeightRatio * AppConstants.SCREE_HEIGHT;
        return Bitmap.createScaledBitmap(bitmap, backgroundScaledWidth, AppConstants.SCREE_HEIGHT, false);
    }
}

