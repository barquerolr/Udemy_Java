package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Wall wall = new Wall(5,4);
        System.out.println("Area = " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("\nWidth = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());

        Wall wall2 = new Wall(1.125, -1);
        System.out.println("\nWidth = " + wall2.getWidth());
        System.out.println("Height = " + wall2.getHeight());
    }
}
