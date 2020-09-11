package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int int = 5; Gives error
        //can use instead
        //int int2 = 5;
        //false, true, null
        double milesConversion = 1.609344;
        double milesToConvert = 100;
        double kilometers = milesToConvert * milesConversion;
        System.out.println("100 miles = " + kilometers + " kilometers");
        int highScore = 50;
        if(highScore == 50)
        {
            System.out.println("This is an expression");
        }


        /***********************Challenge**************************/
        //In the following code that I will type below, write down that parts of the code
        // are the expressions.
        int score = 100; //The expression is: score = 100
        if(score > 99) //The expression is: score > 99
        {
            System.out.println("You got the high score!"); //The expression is: You got the high score
            score = 0; //The expression is: score = 0
        }
    }
}
