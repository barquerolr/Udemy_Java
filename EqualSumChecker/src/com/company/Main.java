package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        hasEqualSum(1, 1, 1);
        hasEqualSum(1, 1, 2);
        hasEqualSum(1, -1, 0);
        hasEqualSum(5, 4, 9);
        hasEqualSum(8, 13, -85);
    }

    public static boolean hasEqualSum(int num1, int num2, int result)
    {
        boolean equal;
        int addition = num1 + num2;
        if(addition == result)
        {
            equal = true;
            System.out.println(equal + ": addition and result are equal");
        }

        else
        {
            equal = false;
            System.out.println(equal + ": addition and result are not equal");
        }

        return equal;
    }
}