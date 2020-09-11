package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        hasTeen(9, 99, 19);
        hasTeen(23,15, 42 );
        hasTeen(22, 23, 34);
    }

    public static boolean hasTeen(int num, int num2, int num3)
    {
        boolean teen = isTeen(num);
        boolean teen2 = isTeen(num2);
        boolean teen3 = isTeen(num3);

        boolean result;

        if(teen || teen2 || teen3)
        {
            result = true;
            System.out.println(result + ": One of these numbers is a teen");
        }

        else
        {
            result = false;
            System.out.println(result + ": None of the numbers is a teen");
        }

        return result;
    }

    public static boolean isTeen(int number)
    {
        boolean teen;
        if(number >= 13 && number <= 19)
        {
            teen = true;
        }

        else
        {
            teen = false;
        }

        return teen;
    }
}
