package com.example.myapplication;

// Image row class
public class Image {
    private final String name;
    private final String url;
    private final String fact;

    public Image(String name, String url, String fact) {
        this.name = name;
        this.url = url;
        this.fact = fact;
    }

    public String getName() {
        return this.name;
    }

    public String getUrl() {
        return this.url;
    }

    public String getFact() {
        return this.fact;
    }

}
