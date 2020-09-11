package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage()
    {
        int num;
        int sum = 0;
        int amount = 0;
        long average = 0L;
        boolean first = true;

        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.println("Enter number: ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt)
            {
                num = scanner.nextInt();
                sum+=num;
                amount++;
                average = Math.round((double)sum / amount);
            }

            else
            {
                break;
            }

            scanner.nextLine();
        }
        scanner.close();
        System.out.println("SUM = "+ sum + " AVG = " + average);
    }
}
