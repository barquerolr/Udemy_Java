package com.company;

public class Microwave {
    private String model;
    private String manufacuturer;
    private int power;
    private int length;
    private int wirdth;
    private int height;

    public Microwave(String model, String manufacuturer, int power, int length, int wirdth, int height) {
        this.model = model;
        this.manufacuturer = manufacuturer;
        this.power = power;
        this.length = length;
        this.wirdth = wirdth;
        this.height = height;
    }

    public String getModel() {
        return model;
    }

    public String getManufacuturer() {
        return manufacuturer;
    }

    public int getPower() {
        return power;
    }

    public int getLength() {
        return length;
    }

    public int getWirdth() {
        return wirdth;
    }

    public int getHeight() {
        return height;
    }
}
