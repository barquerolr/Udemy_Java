package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isPerfectNumber(6);
        isPerfectNumber(28);
        isPerfectNumber(5);
        isPerfectNumber(-1);
    }

    public static boolean isPerfectNumber(int number) {
        int divisor;
        boolean perfect = false;
        int counter = 0;

        System.out.println("\nNum1 = " + number);

        if (number >= 1)
        {
            int count = 1;

            while (count <= number)
            {
                divisor = number % count;

                if (divisor == 0)
                {
                    System.out.println("Divisor = " + count);
                    counter+= count;
                }

                count++;
            }

            counter = counter - number;
            System.out.println("Count = " + counter);

            if(number == counter)
            {
                perfect = true;
                System.out.println("The number " + number + " is a perfect number");
            }

            else
            {
                System.out.println("The number " + number + " is not a perfect number");
            }
        }

        else
        {
            perfect = false;
            System.out.println("Invalid Value");
        }

        return perfect;
    }
}
