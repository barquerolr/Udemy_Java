package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args)
    {
        //areEqualByThreeDecimalPlaces(-25.5056, 69.55);
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
        areEqualByThreeDecimalPlaces(3.175, 3.176);
        areEqualByThreeDecimalPlaces(3.0, 3.0);
        areEqualByThreeDecimalPlaces(-3.123, 3.123);

//        if(isEqual == true)
//        {
//            System.out.println(isEqual + ": second test passed. Numbers are equal.");
//        }
//
//        else
//        {
//            System.out.println(isEqual + ": second test failed. Numbers are not equal");
//        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {
        boolean equal;
        double conversion1 = num1 * 1000;
        double conversion2 = num2 * 1000;
        int round = (int) conversion1;
        int round2 = (int) conversion2;
        //System.out.println("The two numbers: " + num1 + " and " + num2 );
        //System.out.println("Rounding: " + round + " and " + round2);

        if (round == round2)
        {
            equal = true;
            System.out.println(equal + ": the numbers " + num1 + " and " + num2 + " are equal");
        }

        else
        {
            equal = false;
            System.out.println(equal + ": the numbers " + num1 + " and " + num2 + " are not equal");
        }

        return equal;
    }
}
