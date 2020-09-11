package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int has a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue =  2_147_483_647;
        int myTotal = (myMinValue) / 2;
        System.out.println("myTotal = " + myTotal);

        //byte has a width of 8
        byte myByteValue = -128;
        //Gives Error:
        // byte myNewByteValue = (myByteValue) / 2;
        byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //short has a width of 16
        short myShortValue = 30000;
        //Once again, error
        // short myNewShortValue = (myShortValue /2);
        short myNewShortValue = (short)(myShortValue /2);
        System.out.println("myNewShortValue = " + myShortValue);

        //long has a width of 64
        long muLongMinValue = -9_223_372_036_854_775_808L;
        long muLongMaxValue =  9_223_372_036_854_775_807L;



        /****************Challenge*******************/
        //1. Create a byte variable and set it to any valid byte number
        //2. Create a short variable and set it to any valid short number
        //3. Create an int variable and set it to any valid int number
        //4. Create a variable of type long and make it equal to
        //   5000 + 10 times the sum of the byte, plus the short plus the int


        byte myByte = 25;
        short myShort = 300;
        int myInt = 369;
        long myLong = 5000L + (10L * (myByte + myShort + myInt ));
        //Error
        // short shortTotal = 1000 + (10 * (myByte + myShort + myInt));
        short shortTotal = (short) (1000 + (10 * (myByte + myShort + myInt)));
        System.out.println("myByte = " + myByte);
        System.out.println("myShort = " + myShort);
        System.out.println("myInt = " + myInt);
        System.out.println("myLong = " + myLong);
        System.out.println("ShortTotal = " + shortTotal);

    }
}
