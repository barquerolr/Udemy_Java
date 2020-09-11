package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        -Read the numbers from the console entered by the user and print the minimum and maximum number the user has
        entered.
        -Before the user enters the number, print the message "Enter number: "
        -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
        -Hint:
         = Use an endless while loop
        -Bonus
         =Create a project with the name MinAndMaxInputChallenge
         */

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        //int min2 = 2147483647;
        //int max2 = -2147483648;
        //int max3 = Integer.MAX_VALUE;
        //int min3 = Integer.MIN_VALUE;
        int max = 0;
        int count = 0;
        int num = 0;
        boolean first = true;

        while(true)
        {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt)
            {
                num = scanner.nextInt();
                if(first)
                {
                    first = false;
                    min = num;
                    max = num;
                }

                if(num > max)
                //if(num > max2)
                {
                    max = num;
                    //max2 = num;
                }

                if(num < min)
                //if(num < min2)
                {
                    min = num;
                    //min2 = num;
                }
            }


            else
            {
                System.out.println("Max = " + max);
                //System.out.println("Max = " + max2);
                System.out.println("Min = " + min);
                //System.out.println("Min = " + min2);
                break;
            }

            scanner.nextLine();
        }

        scanner.close();
    }
}
