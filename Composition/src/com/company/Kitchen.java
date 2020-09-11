package com.company;

public class Kitchen {
    private Microwave microwave;
    private Oven ovenType;
    private Fridge refrigerator;

    public Kitchen(Microwave microwave, Fridge refrigerator, Oven ovenType) {
        this.microwave = microwave;
        this.refrigerator = refrigerator;
        this.ovenType = ovenType;
    }

    public Microwave getMicrowave() {
        return microwave;
    }

    public Oven getOvenType() {
        return ovenType;
    }

    public Fridge getRefrigerator() {
        return refrigerator;
    }


    public void microw(int seconds)
    {
        System.out.println("Turning on microwave, and setting it for " + seconds + " seconds");
    }

    public void fridge(int items)
    {
        System.out.println("Opening fridge and acquiring " + items + " items");
    }

    private void cooking()
    {
        ovenType.preheating(375);
    }
}
