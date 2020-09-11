package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int value = 3;

        if(value == 1)
        {
            System.out.println("Value was 1");
        }

        else if(value == 2)
        {
            System.out.println("Value was 2");
        }

        else
        {
            System.out.println("value was not 1 or 2");
        }

        int switch_value = 3;

        switch (switch_value)
        {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
            System.out.println("Value was a 3, or a 4, or a 5");
            System.out.println("Actually it wss a " + switch_value);
                break;

            default:
                System.out.println("Value not 1 or 2");
                break;
        }

        /***********************************Challenge**********************************/
        //Create a new switch statement using char instead of int
        //Create a new char variable
        //Create a switch statement testing for A, B, C, D, or E
        //Display a message if any of these were found and then break
        //Add a default, which displays a message saying none of the letters were found

        char switchChar = 'A';
        switch(switchChar)
        {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("The letter " + switchChar + " was found");
                break;

            default:
                System.out.println("None of the letters A, B, C, D, or E were found");
                break;
        }

        String month = "April";
        switch(month)
        {
            case "January":
                System.out.println("Jan");
                break;

            case "April":
                System.out.println("Apr");
                break;

            default:
                System.out.println("Not sure");
        }
    }
}
