package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        sumDigits(987654321);
        ///sumDigits(-10);
        //sumDigits(10);
        //sumDigits(9);
        //sumDigits(125);
//        int x = 106;
//        int y = x / 10;
//        System.out.println(y);

    }

    public static int sumDigits(int number)
    {
        int mod;
        int remainder;
        int sum = 0;

        if(number < 10)
        {
            sum = -1;
            System.out.println("Invalid Entry");
            return sum;
        }

        System.out.println("Number = " + number);
        //while(number > 0)
        //{
        // mod = number % 10;
        //sum+= mod;
        //number /= 10;
        //}
        //return sum;
        while(number >= 10)
        {
           mod =  number % 10;
           //System.out.println("Mod = " + mod);
           number = number / 10;
          // System.out.println("Num = " + number);
           sum+= mod;
           //System.out.println("Remainder = " + remainder);
           //sum = remainder + mod;
           //System.out.println("Sum = " + sum);
        }

        sum = sum + number;
        System.out.println("Sum = " + sum);
        return sum;
    }
}
