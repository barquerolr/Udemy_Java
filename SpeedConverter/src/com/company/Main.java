package com.company;

public class Main {

    public static void main(String[] args)
    {
        // write your code here
        //double conversion = toMilersPerHour(1.6);
        printConversion(1.6);
        //System.out.println("Answer: " + conversion);

        //conversion = toMilersPerHour(10.25);
        printConversion(10.25);
        //System.out.println("Answer: " + conversion);

        //conversion = toMilersPerHour(-5.6);
        printConversion(-5.6);
        //System.out.println("Answer: " + conversion);

       // conversion = toMilersPerHour(25.42);
        printConversion(25.42);
       //System.out.println("Answer: " + conversion);

       // conversion = toMilersPerHour(74.114);
        printConversion(74.114);
        //System.out.println("Answer: " + conversion);

        printConversion(0.0);

    }

    public static long toMilesPerHour(double kilometersPerHour)
    {
        if (kilometersPerHour > 0)
        {
            double conversion = 1.609;
            double milesPerHour = kilometersPerHour / conversion;
            long rounded = Math.round(milesPerHour);
            return rounded;
        }
        else if(kilometersPerHour == 0)
        {
            return 0;
        }

        else
            return -1;
    }

    public static void printConversion(double kilometersPerHour)
    {
        long conversion = toMilesPerHour(kilometersPerHour);
        if(conversion >= 0)
        {
            System.out.println(kilometersPerHour + " km/h = " + conversion + " mi/h");
        }

        else if(conversion == 0)
        {
            int zero = (int) conversion;
            System.out.println(kilometersPerHour + " km/h = "+ zero + " mi/h");
        }

        else
        {
            System.out.println("Invalid Value");
        }
    }
}