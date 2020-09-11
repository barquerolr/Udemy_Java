package com.company;

public class Main {

    public static void main(String[] args) {

        //width of integer = 32 (4 bytes)
        int myIntValue = 5 / 3;
        //width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
        System.out.println("myFloatValue = " + myFloatValue);

        /*****************Challenge*******************/
        //Convert a given number of pounds to kilograms
        //1. Create a variable to store a number of pounds
        //2. Calculate the number of Kilograms for the number above and store it in a variable.
        //3. Print out the result.
        //
        //MOTES: 1 pound is equal to 0.45359237 kilograms

        double pounds = 0.0;
        double kilograms = 0.0;
        double conversion = 0.0;
        pounds = 200;
        kilograms = 0.45359237;
        conversion = pounds * kilograms;
        System.out.println("Pounds: " + pounds);
        System.out.println("Kilograms: " + conversion);
        // Google conversion = 90.7185
        // Program Conversion = 90.718474
        double pi = 3.1415927d;
        double pi2 = 3.141_592_7d;
    }
}
