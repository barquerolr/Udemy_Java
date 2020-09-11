package com.company;

public class DeluxeBurger extends Hamburger {

    private String chips;
    private String drink;
    private double chipsAndDrinkCost;
    private double totalDeluxeCost;

    public DeluxeBurger(String bread, String meat, double price) {
        super(bread, meat, price, "Deluxe Burger");
        this.chips = "Chips";
        this.drink = "Drink";
        this.chipsAndDrinkCost = 3.0;

        super.setAddition1("NULL");
        super.setAddition2("NULL");
        super.setAddition3("NULL");
        super.setAddition4("NULL");

    }

    public String getChips() {
        return chips;
    }

    public String getDrink() {
        return drink;
    }

    @Override
    public void info() {
        //super.info();

        if (super.getAddition1() != null || super.getAddition2() != null || super.getAddition3() != null || super.getAddition2() != null)
        {
            super.setAddition1("NULL");
            super.setAddition2("NULL");
            super.setAddition3("NULL");
            super.setAddition4("NULL");


            System.out.println("Super Test " + super.getAddition1());
            System.out.println("Super Test2 " + super.getAddition2());
            System.out.println("Super Test3 " + super.getAddition3());
            System.out.println("Super Test4 " + super.getAddition4());
        }

        System.out.println("\nDeluxe Burger: " + this.getName());
        System.out.println("Base Price: $" + this.getPrice());
        System.out.println("Since this is a Deluxe, no additions allowed");
        System.out.println("Chips and Drink Cost: $" + this.chipsAndDrinkCost);

        this.totalDeluxeCost = this.getPrice() + this.chipsAndDrinkCost;
        System.out.println("Total Cost: $" + this.totalDeluxeCost);
    }

    @Override
    public void setAddition1(String addition1) {
       //super.setAddition1(addition1);
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void setAddition2(String addition2) {
        //super.setAddition2(addition2);
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void setAddition3(String addition3) {
        //super.setAddition3(addition3);
        System.out.println("Cannot not add additional items to a deluxe burger");
    }

    @Override
    public void setAddition4(String addition4) {
        //super.setAddition4(addition4);
        System.out.println("Cannot not add additional items to a deluxe burger");
    }
}
