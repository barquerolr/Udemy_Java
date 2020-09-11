package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        hasSharedDigit(45, 59);
        hasSharedDigit(12, 23);
        hasSharedDigit(98, 45);
        hasSharedDigit(9, 99);
        hasSharedDigit(15, 55);
    }

    public static boolean hasSharedDigit(int num1, int num2)
    {
        int mod;
        int mod2;
        int remainder;
        int remainder2;
        boolean sharingIsCaring = false;

        System.out.println("\nNum1 = " + num1);
        System.out.println("Num2 = " + num2);

        if(num1 > 10 && num2 > 10)
        {
            while((num1 <= 99) && (num2 <= 99))
            {
                remainder = num1 % 10;
                mod = num1 / 10;
                remainder2 = num2 % 10;
                mod2 = num2 / 10;

                if((remainder == remainder2) || (remainder == mod2) || (mod == remainder2) || (mod == mod2))
                {
                    sharingIsCaring = true;
                    System.out.println(sharingIsCaring + ": The two numbers share a common digit");
                    break;
                }

                else
                {
                    sharingIsCaring = false;
                    System.out.println(sharingIsCaring + ": The two numbers do not share a common digit");
                    break;
                }

            }
        }

        else
        {
            System.out.println(sharingIsCaring + ": Invalid Entry");
        }


        return sharingIsCaring;
    }
}