package com.company;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        int prime = 0;
        prime = getLargestPrime(21);
        //prime = getLargestPrime(217);
        //prime = getLargestPrime(0);
        //prime = getLargestPrime(16);
        //prime = getLargestPrime(-1);
        //prime = getLargestPrime(7);
        System.out.println("Prime = " + prime);
        int x = 21 % 21;
        System.out.println(x);
    }

    public static int getLargestPrime(int number)
    {
        int prime = 2;
        int mod = 0;
        int modding = 0;
        int mode = 0;

        if(number <= 1)
        {
            prime = -1;
        }


        for(int i = 2; i <= (number); i = i + 1)
        {
            mod = number % i;

            if(mod == 0)
            {
                prime = i;
                number /= i;
                i--;
            }

        }

        return prime;
    }

    public static int getLargestPrime2(int number)
    {
        if (number <= 1)
            return -1;

        for (int i = number; i > 1; i--) {

            if (number % i == 0) {
                number = i;
            }
        }
        return number;
    }
}
