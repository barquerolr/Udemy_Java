package com.company;

public class Oven {
    private String model;
    private String manufacturer;
    private int degrees;

    public Oven(String model, String manufacturer, int degrees) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.degrees = degrees;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getDegrees() {
        return degrees;
    }

    public void preheating(int dg)
    {
        System.out.println("Preheating the oven to " + dg + " degrees");
    }

}
