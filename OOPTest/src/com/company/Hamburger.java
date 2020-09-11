package com.company;

public class Hamburger {
    private String name;
    private String bread;
    private String meat;
    private String addition1;
    private String addition2;
    private String addition3;
    private String addition4;
    private double price;
    private double additionCost;
    private double totalCost;

    public Hamburger(String bread, String meat, double price, String name) {
        this.bread = bread;
        this.meat = meat;
        this.price = price;
        this.name = name;
    }

    public String getAddition1() {
        return addition1;
    }

    public String getAddition2() {
        return addition2;
    }

    public String getAddition3() {
        return addition3;
    }

    public String getAddition4() {
        return addition4;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public double getAdditionCost() {
        return additionCost;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setAddition1(String addition1) {
        this.addition1 = addition1;
    }

    public void setAddition2(String addition2) {
        this.addition2 = addition2;
    }

    public void setAddition3(String addition3) {
        this.addition3 = addition3;
    }

    public void setAddition4(String addition4) {
        this.addition4 = addition4;
    }

    public void info()
    {
        System.out.println("\nHamburger: " + this.name);
        System.out.println("Base Price: $" + this.price);
        if(this.addition1 != null)
        {
            System.out.println("Addition 1: " + this.addition1);
        }

        if(this.addition2 != null)
        {
            System.out.println("Addition 2: " + this.addition2);
        }

        if(this.addition3 != null)
        {
            System.out.println("Addition 3: " + this.addition3);
        }

        if(this.addition4 != null)
        {
            System.out.println("Addition 4: " + this.addition4);
        }

        System.out.println("Additions Cost: $" + this.additionCost);
        this.totalCost = this.price + this.additionCost;
        System.out.println("Total Cost: $" + this.totalCost);
    }

    public void additionalCost()
    {
       int counter = 0;
       double additionsCost = 0.75;
       if (this.addition1 != null)
       {
           System.out.println("Added " + addition1 + " for $" + additionsCost);
           counter++;
       }

        if (this.addition2 != null)
        {
            System.out.println("Added " + addition2  + " for $" + additionsCost);
            counter++;
        }

        if (this.addition3 != null)
        {
            System.out.println("Added " + addition3 +  " for $" + additionsCost);
            counter++;
        }

        if (this.addition4 != null)
        {
            System.out.println("Added " + addition4  + " for $" + additionsCost);
            counter++;
        }

        this.additionCost= counter * additionsCost;
        System.out.println("Total Additionals Cost: $" + this.additionCost);

    }
}
