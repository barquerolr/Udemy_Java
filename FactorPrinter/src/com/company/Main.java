package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }

    public static void printFactors(int first) {
        int divisor;

        System.out.println("\nNum1 = " + first);

        if (first >= 1)
        {
            int count = 1;

            while (count <= first)
            {
                divisor = first % count;

                if (divisor == 0)
                {
                    System.out.println(count);
                }

                count++;
            }
        }

        else
        {
            System.out.println("Invalid Value");
        }
    }
}

