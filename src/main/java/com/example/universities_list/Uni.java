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
        if(country.length()>0){
            this.country = country;
        }else{
            throw new IllegalArgumentException("Length must be greater than 0 for: "+ country);
        }
    }

    public String[] getDomains() {
        return domains;
    }

    public void setDomains(String[] domains) {
        if(domains.length>0) {
            this.domains = domains;
        }else{
            throw new IllegalArgumentException("Length must be greater than 0 for: "+ domains);
        }
    }

    public String[] getWeb_pages() {
        return web_pages;
    }

    public void setWeb_pages(String[] web_pages) {
        if(web_pages.length>0) {
            this.web_pages = web_pages;
        }else{
            throw new IllegalArgumentException("Length must be greater than 0 for: "+ web_pages);
        }
    }

    public String getAlpha_two_code() {
        return alpha_two_code;
    }

    public void setAlpha_two_code(String alpha_two_code) {
        if(alpha_two_code.length()>0){
        this.alpha_two_code = alpha_two_code;
    }else{
            throw new IllegalArgumentException("Length must be greater than 0 for: "+ alpha_two_code);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>0){
            this.name= name;
        }else{
            throw new IllegalArgumentException("Length must be greater than 0 for: "+ name);
        }
    }

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        if(stateProvince.length()>0) {
            this.stateProvince = stateProvince;
        }else{
            throw new IllegalArgumentException("Length must be greater than 0 for: "+ stateProvince);
        }
    }

    @Override
    public String toString() {
        return name;
    }

    public String arrayToString(){
        return Arrays.toString(web_pages);
    }

    public String arrayToStringDomain(){
        return Arrays.toString(domains);
    }



}
