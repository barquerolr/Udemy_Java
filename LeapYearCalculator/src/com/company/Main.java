package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        isLeapYear(1);
        isLeapYear(9999);
        isLeapYear(2500);

        System.out.println("\nYears to check: ");

        isLeapYear(1700);
        isLeapYear(1800);
        isLeapYear(1900);
        isLeapYear(2100);
        isLeapYear(2200);
        isLeapYear(2300);
        isLeapYear(2500);
        isLeapYear(2600);
        isLeapYear(1600);
        isLeapYear(2000);
        isLeapYear(2400);
        isLeapYear(1924);

    }

    public static boolean isLeapYear(int year)
    {
        boolean leaping;
        if(year < 1 || year > 9999)
        {
            leaping = false;
            System.out.println(year + " is an invalid Year");
        }

        else if(year % 4 == 0)
        {
            System.out.println(year + " is divisible by 4. Check 1");
            if(year % 100 == 0)
            {
                System.out.println(year + " divisible by 100. Check 2");
                if (year % 400 == 0)
                {
                    leaping = true;
                    System.out.println(year + " divisible by 400. Check 3");
                    System.out.println(year + " is a leap year, so " + leaping);
                }

                else
                {
                    leaping = false;
                    System.out.println(year + " is not divisible by 400. Fail check 3");
                    System.out.println(year + " is not a leap year, so " + leaping);
                }
            }

            else
            {
                leaping = true;
                System.out.println(year + " is not divisible by 100, failed check 2, but it's still a leap year");
                System.out.println(year + " is not a leap year, so " + leaping);
            }
        }

        else
        {
            leaping = false;
            System.out.println(year + " is not divisible by 4. Fail check 1");
            System.out.println(year + " is not a leap year, so " + leaping);
        }

        System.out.println("\n");
        return leaping;
    }
}
