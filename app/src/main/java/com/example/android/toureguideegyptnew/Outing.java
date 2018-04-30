package com.example.android.toureguideegyptnew;

public class Outing {

    private int mOutingName;
    private int mOutingText;
    private int mOutingWeb;
    private int mOutingImage;
    private int mOutingPlace;

    public Outing(int mOutingName, int mOutingText, int mOutingWeb, int mOutingPlace, int mOutingImage) {
        this.mOutingName = mOutingName;
        this.mOutingText = mOutingText;
        this.mOutingWeb = mOutingWeb;
        this.mOutingPlace = mOutingPlace;
        this.mOutingImage = mOutingImage;
    }

    public int getmOutingName(){
        return mOutingName;
    }

    public int getmOutingImage(){
        return mOutingImage;
    }

    public int getmOutingWeb(){
        return mOutingWeb;
    }

    public int getmOutingText(){
        return mOutingText;
    }

    public int getmOutingPlace(){
        return mOutingPlace;
    }

}