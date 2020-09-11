package com.company;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        //System.out.println("Testing");
        printSquareStar(9);
    }

    public static void printSquareStar(int number)
    {
        if(number < 5)
        {
            System.out.println("Invalid Value");
        }

        else
        {
            for(int i = 0; i < number; i = i + 1)
            {
                for(int j = 0; j < number; j = j + 1)
                {
                    //if(i == 0 || j == 0 || i == j || i == number - 1 || j == number - 1 || i + j == number - 1)
                    if(i == 0 || i == number - 1 || j == 0 || j == number - 1 || i == j || j == number - 1 - i )
                    {
                        System.out.print("*");
                    }

                    else
                    {
                        System.out.print(" ");
                    }
                }

                System.out.println();
            }
        }
    }
}
