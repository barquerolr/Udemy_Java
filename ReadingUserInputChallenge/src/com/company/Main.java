package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
    /*
    -Read 10 numbers from the console entered by the user and print the sum of those numbers.
    -Create a Scanner like we did in the previous video.
    -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
    -If hasNextInt() returns false, print the message "Invalid Number." Continue reading until you have read 10
     numbers.
    -Use the nextInt() method to get the number and add it to the sum.
    -Before the user enters each number, print the message "Enter number #x:" where x represents the count, i.e.
     1, 2, 3, 4, etc.
     -For example, the first message printed to the user would be "Enter number #1:", the next "Enter number #2:",
      and so on.

     Hint:
     -Use a while loop.
     -Use a counter variable for counting valid numbers.
     -Close the scanner after you don't need it anymore.
     -Create a project with the name ReadingUserInputChallenge.
     */

        Scanner scanner = new Scanner(System.in);
        int totalNum = 1;
        int sum = 0;
        while(totalNum <= 10)
        {
            System.out.println("Enter number #" + totalNum + ":");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt)
            {
                int num = scanner.nextInt();
                //scanner.nextLine();
                sum+= num;
                //System.out.println("Total sum is: " + sum);
                totalNum++;
            }

            else
            {
                System.out.println("Invalid Number");
            }

            scanner.nextLine(); // reading and not storing numbers

        }

        System.out.println("Total sum is: " + sum);
        scanner.close();

//        int numbers = 10;
//        int sum = 0;
//        for (int i = 1; i <= numbers; i = i + 1)
//        {
//            System.out.println("Enter number # " + i);
//            int num = scanner.nextInt();
//            sum+= num;
//        }
//
//        System.out.println("Sum is: " + sum);

    }
}
