package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 1;
        while(count != 6)
        {
            System.out.println("Count value is: " + count);
            count++;
        }

        System.out.println("\n");

//        for(int i = 0; i < 7; i = i + 1)
//        {
//            System.out.println("Count value is: " + count);
//        }

        for(count = 1; count != 6; count = count + 1)
        {
            System.out.println("Count value is " + count);
        }

        System.out.println("\n");

        count = 1;
        while(true)
        {
            if(count == 6)
            {
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println("\n");

        count = 1;

        do {
            System.out.println("Count value is " + count);
            count++;

            if(count > 10)
            {
                break;
            }

        }while (count !=6);


        /********************************************Challenge***************************************/
        //Create a method called isEvenNumber that takes a parameter of type int
        //Its purpose is to determine if the argument passed to the method is an even number or not
        //Return true if an even number; otherwise, return false.

        //boolean even;
        int number = 4;
        int finish = 20;

        while(number <= finish)
        {
            number++;
            if(!isEvenNumber(number))
            {
                continue;
            }

            System.out.println("Even number " + number);
        }

        System.out.println("\n");

        /***********************Challenge Continued***************************/
        //Modify the while code above
        //Make it also record the total number of even numbers it has found and break once 5 are found
        //At the end, display the total number of even numbers found.

        int num = 4;
        int fin = 20;
        int even = 0;

        while(num <= fin)
        {
            num++;
            if(!isEvenNumber(num))
            {
                continue;
            }

            System.out.println("Even number " + num);
            even++;
            if(even == 5)
            {
                break;
            }
        }

        System.out.println("\nTotal even numbers: " + even);

        //even = isEvenNumber(2100);
        //System.out.println(even);
    }

    public static boolean isEvenNumber(int number)
    {
        boolean even;

        if(number % 2 == 0)
        {
            even = true;
            System.out.println("\n" + number + " is even");
        }

        else
        {
            even = false;
        }

        return even;
    }
}
