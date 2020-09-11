package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //System.out.println("Hello World");
        sumFirstAndLastDigit(9587);
        sumFirstAndLastDigit(-89);
        sumFirstAndLastDigit(999);

        //sumFirstAndLastDigit(0);
    }

    public static int sumFirstAndLastDigit(int number)
    {
        int sum = 0;
        int mod = 0;
        int lastDigit = 0;

        System.out.println("\nNum = " + number);

        if(number < 0)
        {
            sum = -1;
            System.out.println("Invalid Entry");
        }

        else if(number > 0) //number >= 0.
        {
            mod = number % 10;
            lastDigit = mod;
            System.out.println("First Digit = " + lastDigit);

            while(number >= 10)
            {
                //mod = number % 10;
                //System.out.println("Mod = " + mod);
                number /= 10;
            }

            System.out.println("Last Number = " + number);
            sum = lastDigit + number;
            System.out.println("Sum: " + lastDigit + " + " + number + " = " + sum);
        }

        else
        {
            sum = -1;
        }

        return sum;
    }
}
