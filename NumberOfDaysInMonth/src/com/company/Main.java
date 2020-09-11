package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        System.out.println("\n");

        getDaysInMonth(1,2020);
        getDaysInMonth(2,2020);
        getDaysInMonth(2, 2018);
        getDaysInMonth(-1, 2020);
        getDaysInMonth(-1, -1);
        System.out.println("\n");

        getDaysInMonths(1,2020);
        getDaysInMonths(2,2020);
        getDaysInMonths(2, 2018);
        getDaysInMonths(-1, 2020);
        getDaysInMonths(-1, -1);
        System.out.println("\n");
    }

    public static boolean isLeapYear(int year)
    {
        boolean leaping;

        if(year >= 1 && year <= 9999)
        {
            if(year % 4 == 0)
            {
                if(year % 100 == 0)
                {
                    if(year % 400 == 0)
                    {
                        leaping = true;
                        System.out.println(leaping + ": " + year + " is divisible by 400. Leap year");
                    }

                    else
                    {
                        leaping = false;
                        System.out.println(leaping + ": " + year + " is not a leap year");
                    }
                }

                else
                {
                    leaping = true;
                    System.out.println(leaping + ": " + year + " is not divisible by 400, but is still a leap year");
                }
            }

            else
            {
                leaping = false;
                System.out.println(leaping + ": " + year + " is not divisible by 4, so not a leap year");
            }
        }

        else
        {
            leaping = false;
            System.out.println("Invalid Entry");
        }

        return leaping;
    }

    public static int getDaysInMonth(int month, int year)
    {
        int days = 0;
        int monthModulus = month % 2;
        boolean leap = isLeapYear(year);

        if((month >= 1 && month <= 12) && (year >= 1 && year <= 9999))
        {
            if(month == 2 && leap)
            {
                days = 29;
                System.out.println(year + ": month " + month + " has " + days + " days\n");
            }

            else if(month == 2 && !leap)
            {
                days = 28;
                System.out.println(year + ": month " + month + " has " + days + " days\n");
            }

            else if((monthModulus == 1) && (month <= 7))
            {
                days = 31;
                System.out.println(year + ": month " + month + " has " + days + " days\n");
            }

            else if((monthModulus == 0) && (month <= 6))
            {
                days = 30;
                System.out.println(year + ": month " + month + " has " + days + " days\n");
            }

            else if((monthModulus == 0) && (month >= 8))
            {
                days = 31;
                System.out.println(year + ": month " + month + " has " + days + " days\n");
            }

            else if((monthModulus == 1) && (month >= 9))
            {
                days = 30;
                System.out.println(year + ": month " + month + " has " + days + " days\n");
            }
        }

        else
        {
            days = -1;
            System.out.println("Invalid entry\n");
        }

        return days;
    }

    public static int getDaysInMonths(int month, int year)
    {
        int days = 0;
        boolean leaping = isLeapYear(year);
        if((month >= 1 && month <= 12) && (year >= 1 && year <= 9999))
        {
            switch(month)
            {
                case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                    days = 31;
                    System.out.println(year + ": month " + month + " has " + days + " days\n");
                    //return days // return 31;
                break;

                case 4: case 6: case 9: case 11:
                    days = 30;
                    System.out.println(year + ": month " + month + " has " + days + " days\n");
                    //return days; // return 30;
                break;

                case 2: if(leaping)
                        {
                            days = 29;
                            System.out.println(year + ": month " + month + " has " + days + " days\n");
                            //return 29;
                        }

                         else
                        {
                            days = 28;
                            System.out.println(year + ": month " + month + " has " + days + " days\n");
                            //return 28;
                        }
                break;
            }
        }

        else
        {
            days = -1;
            System.out.println("Invalid Entry\n");
        }

        return days;
    }
}
