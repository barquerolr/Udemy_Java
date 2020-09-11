package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int newScore = calculateScore("Luis", 500);
        System.out.println("New score is " + newScore);

        calculateScore(75);
        calculateScore();

        /********************************Challenge******************************************/

        //Create a method called calcFeetAndInchesToCentimeters
        //It needs to have two parameters
        //The first parameter is feet, the second parameter is inches
        //
        //You should validate that the first parameter, feet, is >= 0
        //You should validate that the second parameter, inches, is >= 0
        //Return -1 from the method if either of the above is not true.
        //
        //If the parameters are valid, then calculate how many centimeters
        //comprise the feet and inches passed to this method and return that value
        //
        //Create a second method of the same name, but with only one parameter: inches
        //Validate that inches is >= 0
        //Return -1 if it's not true
        //But if it's valid, then calculate how many feet are in the inches, and then
        //here's the tricky part
        //Call the other overloaded method passing the correct feet and inches
        //calculated so that it calculate correctly
        //
        //Hints: Use double for your number datatypes
        //1 inch = 2.54 cm and 1 ft = 12 in
        //Use the link I give you to confirm your code is calculating correctly.
        //Calling another overloaded method just requires you to use the right number of parameters

        calcFeetAndInchesToCentimetes(15);
        calcFeetAndInchesToCentimetes(69);
        calcFeetAndInchesToCentimetes(74);
        calcFeetAndInchesToCentimetes(0);
        calcFeetAndInchesToCentimetes(-74);
        calcFeetAndInchesToCentimetes(1);
        calcFeetAndInchesToCentimetes(2);
    }

    public static int calculateScore(String playerName, int score)
    {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score)
    {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore()
    {
        System.out.println("No player name, so no points\n");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches)
    {
        double conversion;
        double totalInches;
        double centimeters = 2.54;
        double toCentimeters;

        if((feet >= 0) && (inches >= 0 && inches <= 12))
        {
            conversion = feet * 12;
            totalInches = inches + conversion;
            System.out.println("Given " + feet + " ft and " + inches + " in:");
            toCentimeters = totalInches * centimeters;
        }

        else
        {
            toCentimeters = -1;
        }

        return toCentimeters;
    }

    public static void calcFeetAndInchesToCentimetes(double inches)
    {
        double feet;
        double conversion;
        double remainingInches;
        double toCentimeters;

        if(inches >= 0)
        {
            conversion = inches % 12;
            if(conversion == 0)
            {
                feet = inches / 12;
                remainingInches = 0;
                System.out.println("Conversion: " + inches + " = " + feet + " feet");
                toCentimeters = calcFeetAndInchesToCentimeters(feet, remainingInches);
                System.out.println("Total centimeters is: " + toCentimeters+ "\n");
            }

            else
            {
                remainingInches = inches % 12;
                feet = (inches - remainingInches) / 12;
                //feet = (int) inches / 12;
                //remainingInches = (int) inches % 12;
                System.out.println(inches + " in = " + feet + " ft and " + remainingInches + " in");
                toCentimeters = calcFeetAndInchesToCentimeters(feet, remainingInches);
                System.out.println("Total centimeters is: " + toCentimeters+ "\n");
            }
        }

        else
        {
            System.out.println("Invalid Entry\n");
        }
    }
}
