package com.example.universities_list;

import java.util.Arrays;
import java.util.List;

public class UniDetails {
    private String country;
    private String[] domains;
    private String[] web_pages;
    private String name;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UniDetails{" +
                "web_pages=" + Arrays.toString(web_pages) +
                '}';
    }
}
