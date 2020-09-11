package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getEvenDigitSum(148796);
        getEvenDigitSum(0);
        getEvenDigitSum(-1);
    }

    public static int getEvenDigitSum(int number)
    {
        int sum = 0;
        int mod = 0;
        int even = 0;

        System.out.println("\nNumber = " + number);

        if(number >= 0)
        {
            while(number > 0)
            {
                mod = number % 10;
                even = mod % 2;
                if(even == 0)
                {
                    System.out.println("Even numbers: " + mod);
                    sum+= mod;
                }

                number /= 10;
            }

            System.out.println("Sum = " + sum);
        }

        else
        {
            sum = -1;
            System.out.println("Invalid Entry");
        }

        return sum;
    }
}
