package com.company;

import javafx.css.Size;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Skyrim is not that bad");
        numberToWords(234);
        numberToWords(100);
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
        numberToWords(0);
        numberToWords(1010);
        //getDigitCount(1010);
//        getDigitCount(0);
//        getDigitCount(123);
//        getDigitCount(-12);
//        getDigitCount(5200);
//        getDigitCount(001);
//        getDigitCount(1001);
    }

    public static void numberToWords(int number)
    {
        System.out.println("\nOriginal Number = " + number);
        int mod = 0;
        int reverse = 0;
        int digit = 0;

        if(number < 0)
        {
            System.out.println("Invalid Value");
        }

        if(number == 0)
        {
            System.out.println("Zero");
        }

        digit = getDigitCount(number);
        reverse = reverse(number);
        System.out.println("Reversed Number = " + reverse);

        while(reverse > 0)
        {
            for(int i = 0; i < digit; i = i + 1)
            {
                mod = reverse % 10;

                switch(mod)
                {
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;

                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;

                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;

                    case 7:
                        System.out.println("Seven");
                        break;

                    case 8:
                        System.out.println("Eight");
                        break;

                    case 9:
                        System.out.println("Nine");
                        break;

                    default:
                        System.out.println("Zero");
                        break;
                }

                reverse = reverse / 10;
            }
        }
    }

    public static int reverse(int reverseNumber)
    {
        int reversing = 0;
        int mod = 0;

        while ((reverseNumber != 0))
        {
            mod = reverseNumber % 10;
            reversing = reversing * 10;
            reversing+= mod;
            reverseNumber = reverseNumber / 10;
        }

        return reversing;
    }

    public static int getDigitCount(int number)
    {
        int mod = 0;
        int count = 0;

        if(number < 0)
        {
            count = -1;
        }

        if(number == 0)
        {
            count++;
            //mod = number % 10;
            number = number / 10;
        }

        while(number > 0)
        {
            mod = number % 10;
            count++;
            number = number / 10;
        }

        System.out.println("Total digits in the number = " + count);
        return count;
    }
}
