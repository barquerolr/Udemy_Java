package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isOdd(35);
        isOdd(26);
        isOdd(-1);

        System.out.println("\n");
        sumOdd(1, 100);
        sumOdd(-1, 100);
        sumOdd(100, 100);
        sumOdd(13,13);
        sumOdd(100, -100);
        sumOdd(100, 1000);
        sumOdd(10, 5);
    }

    public static boolean isOdd(int number)
    {
        boolean odd;
        if(number < 0)
        {
            odd = false;
            System.out.println("Invalid Entry");
            return odd;
        }

        else if(number % 2 == 1)
        {
            odd = true;
            //System.out.println(number + " is odd");
        }

        else
        {
            odd = false;
           // System.out.println(number + " is not odd");
        }

        return odd;
    }

    public static int sumOdd(int start, int end)
    {
        boolean odd;
        int sum = 0;
        if((start > 0 && end > 0) && (end >= start))
        {
            for(int i = start; i <= end; i = i + 1)
            {
                odd = isOdd(i);
                if(odd)
                {
                    sum+= i;
                }
            }

            System.out.println("Sum of the odd numbers = " + sum + "\n");
        }

        else
        {
            System.out.println("Invalid Entry\n");
            sum = -1;
        }

        return  sum;
    }
}
