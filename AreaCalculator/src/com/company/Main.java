package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        area(5.0);
        area(-1.0);
        area(1);
        area(5.0, 4.0);
        area(-1.0, 4.0);
    }

    public static double area(double radius)
    {
        double area;
        if (radius >= 0)
        {
            area = radius * radius * Math.PI;
            System.out.println("Area of the circle with radius " + radius + " = " + area);
        }

        else
        {
            area = -1;
            System.out.println("Invalid Entry");
        }

        return area;
    }

    public static double area(double x, double y)
    {
        double area;

        if(x >= 0 && y >= 0)
        {
            area = x * y;
            System.out.println("Area between " + x + " and " + y + " y = " + area);
        }

        else
        {
            area = -1;
            System.out.println("Invalid Input");
        }

        return area;
    }

}
