package com.example.alessander.flappybird;

import android.content.Context;

public class AppConstants {

    static BitmapBank bitmapBank; //Bitmap object reference
    static GameEngine gameEngine; //GameEngine object reference

    public static void initialization(Context context) {
        bitmapBank = new BitmapBank(context.getResources());
        gameEngine = new GameEngine();
    }

    public static BitmapBank getBitmapBank() {
        return bitmapBank;
    }

    public static GameEngine getGameEngine() {
        return gameEngine;
    }

}
