package com.company;

public class Fridge {
    private String model;
    private String manufacturer;
    private int cost;
    private int watts;

    public Fridge(String model, String manufacturer, int cost, int watts) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cost = cost;
        this.watts = watts;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getCost() {
        return cost;
    }

    public int getWatts() {
        return watts;
    }
}
