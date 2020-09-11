package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);
        printYearsAndDays(-1);
        printYearsAndDays(0);
    }

    public static void printYearsAndDays(long minutes)
    {
        long remainingDays;
        long mins;
        long days;
        long years;

        if(minutes >= 0)
        {
            mins = minutes / 60;
            days = mins / 24;
            years = days / 365;
            remainingDays = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + remainingDays + " d");
        }

        else
        {
            System.out.println("Invalid Value");
        }
    }
}
