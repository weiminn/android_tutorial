package com.weiminn.fragments;

public enum ModelCourse {

    RED(R.string.red, R.layout.view_red),
    GREEN(R.string.green, R.layout.view_green),
    BLUE(R.string.blue, R.layout.view_blue);

    private int mTitleID;
    private int mLayoutID;

    ModelCourse(int mTitleID, int mLayoutID) {
        this.mTitleID = mTitleID;
        this.mLayoutID = mLayoutID;
    }

    public int getmTitleID() {
        return mTitleID;
    }

    public void setmTitleID(int mTitleID) {
        this.mTitleID = mTitleID;
    }

    public int getmLayoutID() {
        return mLayoutID;
    }

    public void setmLayoutID(int mLayoutID) {
        this.mLayoutID = mLayoutID;
    }
}
