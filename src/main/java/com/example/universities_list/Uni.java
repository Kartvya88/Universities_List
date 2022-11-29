package com.example.universities_list;

import com.google.gson.annotations.SerializedName;

import java.util.Arrays;

public class Uni{
    private String country;
    private String[] domains;
    private String[] web_pages;
    private String alpha_two_code;
    private String name;
    @SerializedName("state-province")
    private String stateProvince;

    public Uni(){

    }
    public Uni(String country, String[] domains, String[] web_pages, String alpha_two_code, String name, String stateProvince) {
        setCountry(country);
        setDomains(domains);
        setWeb_pages(web_pages);
        setAlpha_two_code(alpha_two_code);
        setName(name);
        setStateProvince(stateProvince);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String[] getDomains() {
        return domains;
    }

    public void setDomains(String[] domains) {
        this.domains = domains;
    }

    public String[] getWeb_pages() {
        return web_pages;
    }

    public void setWeb_pages(String[] web_pages) {
        this.web_pages = web_pages;
    }

    public String getAlpha_two_code() {
        return alpha_two_code;
    }

    public void setAlpha_two_code(String alpha_two_code) {
        this.alpha_two_code = alpha_two_code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }


    @Override
    public String toString() {
        return name;
    }


    public String arrayToString(){
        return Arrays.toString(web_pages);
    }
}
