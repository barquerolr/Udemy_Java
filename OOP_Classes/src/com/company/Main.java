package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car porsche = new Car();
        Car holden = new Car();
        Car ferrari = new Car();
        //System.out.println("Model is " + porsche.getModel());
        porsche.setModel("Carrera");
        holden.setModel("commodore");
        ferrari.setModel("Enzo");
        System.out.println("Model is " + porsche.getModel());
        System.out.println("Model is " + holden.getModel());
        System.out.println("Model is " + ferrari.getModel());
    }
}
