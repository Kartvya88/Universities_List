package com.example.universities_list;

import com.google.gson.annotations.SerializedName;

public class Uni {
    private String country;
    private String[] domains;
    private String[] web_pages;
    private String alpha_two_code;
    private String name;
    @SerializedName("state-province")
    private String stateProvince;
}
