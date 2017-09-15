package com.example.country.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by lingez on 9/16/17.
 */

public class CountryModel {

    @SerializedName("name")
    private String countryName;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
}
