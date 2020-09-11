package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //hasSameLastDigit(55, 45);
        hasSameLastDigit(41, 22, 71);
        hasSameLastDigit(23, 32, 42);
        hasSameLastDigit(42, 53, 64);
        hasSameLastDigit(9, 99, 999);
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3)
    {
        int remainder;
        int remainder2;
        int remainder3;

        boolean valid1;
        boolean valid2;
        boolean valid3;
        boolean sharingIsCaring = false;

        System.out.println("\nNum1 = " + num1);
        System.out.println("Num2 = " + num2);
        System.out.println("Num3 = " + num3);

        valid1 = isValid(num1);
        valid2 = isValid(num2);
        valid3 = isValid(num3);

        while (valid1 && valid2 && valid3)
        {
            remainder = num1 % 10;

            remainder2 = num2 % 10;

            remainder3 = num3 % 10;

            if ((remainder == remainder2) || (remainder == remainder3) || (remainder2 == remainder3))
            {
                sharingIsCaring = true;
                System.out.println(sharingIsCaring + ": At least two of the three numbers have the same last digit");
                break;
            }

            else
            {
                sharingIsCaring = false;
                System.out.println(sharingIsCaring + ": The three numbers do not have the same last digit");
                break;
            }

        }

        if((!valid1) || (!valid2) || (!valid3))
        {
            sharingIsCaring = false;
            System.out.println(sharingIsCaring + ": Invalid Entry");
        }


        return sharingIsCaring;
    }

    public static boolean isValid(int number)
    {
        boolean valid;
        if((number >= 10) && (number <= 1000))
        {
            valid = true;
            System.out.println("The number " + number + " is within range");
        }

        else
        {
            valid = false;
            System.out.println("The number " + number + " is not within range");
        }

        return valid;
    }
}
