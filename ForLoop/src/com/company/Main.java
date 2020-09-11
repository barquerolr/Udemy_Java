package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        /************************Challenge****************************/
        //Using the for ststement, call the calculateInterest method with
        //the amount of 10000 with an interestRate of 2, 3, 4, 5, 6, 7, and 8
        //and print the results to the console window

        System.out.println("\n");

        for(int i = 2; i < 9; i = i + 1)
        {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        /***********************Challenge******************************/
        //How would you modify the for loop to do the same thin as shown, but to start from 8% and work back to 2%?

        System.out.println("\n");

        for(int i = 8; i > 1; i = i - 1) // i >= 2
        {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }


        /*********************************Challenge********************************/
        //Create a for statement using any range of numbers
        //Determine if the number is a prime number using the isPrime method
        //If it is a prime number, print it out AND increment a count of the number of prime numbers found.
        //If that count is 3, exit the for loop.
        //Hint: Use the break; statement to exit

        //boolean prime = isPrime(7);
        //System.out.println("\n" + prime);

        boolean prime;
        int count = 0;
        System.out.println("\n");
        for(int i = 15; i < 25; i = i + 1)
        {
            prime = isPrime(i);
            if(prime)
            {
                count++;
                System.out.println(i + " is prime");

                if(count == 3)
                {
                    System.out.println("Exiting loop....");
                    break;
                }
            }

//            else
//            {
//                System.out.println(i + " is not prime");
//            }
        }

        System.out.println("Total number of primes was: " + count);
    }

    public static double calculateInterest(double amount, double interestRate)
    {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n)
    {
        if(n == 1)
        {
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(n); i = i + 1)
        {
            if(n % i == 0)
            {
                return false;
            }
        }

        return true;
    }
}
