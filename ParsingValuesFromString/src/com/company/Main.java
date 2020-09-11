package com.company;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        String numberAsString = "2018";
        System.out.println("numberAsString = " + numberAsString);

        String numString = "2018.125";
        System.out.println("NumString = " + numString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("Number = " + number);

        double num = Double.parseDouble((numString));
        System.out.println("Num = " + num);

        numberAsString = numberAsString + 1;
        numString += 1;
        number = number + 1;
        num = num + 1;

        System.out.println("\nnumberAsString = " + numberAsString);
        System.out.println("NumString = " + numString);
        System.out.println("Number = " + number);
        System.out.println("Num = " + num);
    }
}
