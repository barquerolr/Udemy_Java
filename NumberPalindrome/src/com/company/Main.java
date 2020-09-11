package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        isPalindrome(-1331);
        isPalindrome(1551);
        isPalindrome(1256);
        isPalindrome(-9685);
    }

    public static boolean isPalindrome(int number)
    {
        System.out.println("Number = " + number);

        int mod;
        int reverse = 0;
        int num;
        boolean palindrome;

        num = number;
        if (number < 0)
        {
            number = number * (-1);
            num = number;
        }

        while ((number != 0))
        {
            mod = number % 10;
            reverse = reverse * 10;
            reverse+= mod;
            number = number / 10;
        }

        if (num == reverse)
        {
            System.out.println(num + " is a palindrome");
            palindrome = true;
        }

        else
        {
            System.out.println(num + " is not a palindrome");
            palindrome = false;
        }

        return  palindrome;
    }
}