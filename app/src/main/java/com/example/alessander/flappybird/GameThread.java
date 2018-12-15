package com.example.alessander.flappybird;

import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.Log;
import android.view.SurfaceHolder;

public class GameThread extends Thread {

    SurfaceHolder surfaceHolder; //SurfaceHolder object reference
    boolean isRunning; //Flag to detect whether the thread is running or not
    long startTime, loopTime; //Loop start time and loop duration
    long DELAY = 33; //Delay in milliseconds between screen refreshes

    public GameThread(SurfaceHolder surfaceHolder) {
        this.surfaceHolder = surfaceHolder;
        isRunning = true;
    }

    @Override
    public void run() {
        // Looping until the boolean is false
        while (isRunning) {
            startTime = SystemClock.uptimeMillis();
            //Locking the canvas
            Canvas canvas = surfaceHolder.lockCanvas(null);
            if (canvas != null) {
                synchronized (surfaceHolder) {
                    AppConstants.getGameEnginge().updateAndDrawBackgroundImage(canvas);
                    //unlocking the canvas
                    surfaceHolder.unlockCanvasAndPost(canvas);
                }
            }
            //loop time
            loopTime = SystemClock.uptimeMillis() - startTime;
            if (loopTime < DELAY) {
                try {
                    Thread.sleep(DELAY - loopTime);
                } catch (InterruptedException e) {
                    Log.e("Interrupted", "Interrupted while sleeping");
                }

            }
        }
    }
    public boolean isRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean state) {
        isRunning = state;
    }

}
