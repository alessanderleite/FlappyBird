package com.example.alessander.flappybird;

public class Bird {

    private int birdX, birdY, currentFrame;
    public static int maxFrame;

    public Bird() {
        birdX = AppConstants.SCREEN_WIDTH/2 - AppConstants.getBitmapBank().getBirdWidth()/2;
        birdY = AppConstants.SCREE_HEIGHT/2 - AppConstants.getBitmapBank().getBirdHeight()/2;
        currentFrame = 0;
        maxFrame =3;
    }

    // Getter method for current frame
    public int getCurrentFrame() {
        return currentFrame;
    }

    // Setter method for current frame
    public void setCurrentFrame(int currentFrame) {
        this.currentFrame = currentFrame;
    }

    // Getter method for getting X-coordinate of the Bird
    public int getX() {
        return birdX;
    }

    //Getter method for getting de Y-coordinate of the Bird
    public int getY() {
        return birdY;
    }

    // Setter method for setting the X-coordinate
    public void setX(int birdX) {
        this.birdX = birdX;
    }

    // Setter method for setting the Y-coordinate
    public void setY(int birdY) {
        this.birdY = birdY;
    }

}
