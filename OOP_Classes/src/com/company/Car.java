package com.company;

public class Car {
    private int doors;
    private int wheeels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model)
    {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore") || validModel.equals("enzo"))
        {
            this.model = model;
        }

        else
        {
            this.model = "Unknown";
        }
    }

    public String getModel()
    {
        return this.model;
    }
}
