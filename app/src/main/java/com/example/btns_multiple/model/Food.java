package com.example.btns_multiple.model;

public class Food {

    private String name;
    private String category;
    private String rate;
    private int img;

    public Food(String name, String category, String rate, int img) {
        this.name = name;
        this.category = category;
        this.rate = rate;
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public String getRate() {
        return rate;
    }

    public int getImg() {
        return img;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public void setImg(int img) {
        this.img = img;
    }
}


