package com.company;

public class HealthyBurger extends Hamburger {

    //private String healthyName;
    //private double healthyPrice;
    private String addition5;
    private String addition6;
    private double healthyAdditionsCost;
    private double totalHealthyCost;

    public HealthyBurger(String meat, double price) //, String healthyName, double healthyPrice)
    {
        super("Brown Rye", meat, price, "Healthy Burger");
        //this.healthyPrice = healthyPrice;
        //this.healthyName = healthyName;
    }

    public String getAddition5() {
        return addition5;
    }

    public void setAddition5(String addition5) {
        this.addition5 = addition5;
    }

    public String getAddition6() {
        return addition6;
    }

    public void setAddition6(String addition6) {
        this.addition6 = addition6;
    }

    @Override
    public void additionalCost() {
        int counter = 0;
        double addcost = 0.50;
        //super.additionalCost();

        if(super.getAddition1() != null)
        {
            System.out.println("Added " + super.getAddition1() + " for $" + addcost);
            counter++;
        }

        if(super.getAddition2() != null)
        {
            System.out.println("Added " + super.getAddition2() + " for $" + addcost);
            counter++;
        }

        if(super.getAddition3() != null)
        {
            System.out.println("Added " + super.getAddition3() + " for $" + addcost);
            counter++;
        }

        if(super.getAddition4() != null)
        {
            System.out.println("Added " + super.getAddition4() + " for $" + addcost);
            counter++;
        }

        if (this.addition5 != null)
        {
            System.out.println("Added " + addition5 + " for $" + addcost);
            counter++;
        }

        if (this.addition6 != null)
        {
            System.out.println("Added " + addition6 + " for $" + addcost);
            counter++;
        }

        this.healthyAdditionsCost = counter * addcost;
        System.out.println("Total Healthy Burger Additions Cost: $" + this.healthyAdditionsCost);
    }

    @Override
    public void info() {
        //super.info();
        System.out.println("\nHealthy Burger: "+ this.getName());
        System.out.println("Base Price: $" + this.getPrice());

        if(super.getAddition1() != null)
        {
            System.out.println("Addition 1: " + super.getAddition1());
        }

        if(super.getAddition2() != null)
        {
            System.out.println("Addition 2: " + super.getAddition2());
        }

        if(super.getAddition3() != null)
        {
            System.out.println("Addition 3: " +super.getAddition3());
        }

        if(super.getAddition4() != null)
        {
            System.out.println("Addition 4: " + super.getAddition4());
        }

        if(this.addition5 != null)
        {
            System.out.println("Addition 5: " + this.addition5);
        }

        if(this.addition6 != null)
        {
            System.out.println("Addition 6: " + this.addition6);
        }

        System.out.println("Healthy Additions Cost: $" + this.healthyAdditionsCost);
        this.totalHealthyCost = this.getPrice() + this.healthyAdditionsCost;
        System.out.println("Total Cost: $" + this.totalHealthyCost);
    }
}
