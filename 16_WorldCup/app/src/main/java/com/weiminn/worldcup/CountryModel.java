package com.weiminn.worldcup;

public class CountryModel {
    private String countryName, cupWinCount;
    private int flag_img;

    public CountryModel(String countryName, String cupWinCount, int flag_img) {
        this.countryName = countryName;
        this.cupWinCount = cupWinCount;
        this.flag_img = flag_img;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCupWinCount() {
        return cupWinCount;
    }

    public void setCupWinCount(String cupWinCount) {
        this.cupWinCount = cupWinCount;
    }

    public int getFlag_img() {
        return flag_img;
    }

    public void setFlag_img(int flag_img) {
        this.flag_img = flag_img;
    }
}
