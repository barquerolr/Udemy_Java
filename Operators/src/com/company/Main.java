package com.company;

public class Main {

    public static double pi = 3.141592654;

    public static void main(String[] args) {

        int result = 1 + 2; //2 operators
        int res = 1; //1 operator
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result * 10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println(previousResult + "Result is now " + result);

        result++;
        System.out.println(previousResult + "Result is now " + result);

        result--;
        System.out.println(previousResult + "Result is now " + result);

        result += 2;
        System.out.println(previousResult + "Result is now " + result);

        result *= 10;
        System.out.println(previousResult + "Result is now " + result);

        result -= 10;
        System.out.println(previousResult + "Result is now " + result);

        result /= 10;
        System.out.println(previousResult + "Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
        } else {
            System.out.println("It is an alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("One of these tests is true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

        /*****************Challenge********************/
        //1. Create a double variable with the value of 20
        //2. Create a second variable of type double with the value 80
        //3. Add both numbers up and multiply by 25
        //4. Use the remainder operator to figure out the remainder from the sum of #3 divided by 40
        //5. Write and "if" statement that displays a message "Total was over the limit"
        //   if the remaining total(#4) is equal to 20 or less.

        double num1 = 20.0;
        double num2 = 80.0;
        double num3;
        System.out.println("First number is " + num1 + ", and second number is " + num2);
        double operations = 0.0;
        double remainder = 0.0;
        operations = (num1 + num2) * 25;
        System.out.println("(First number + second number) * 25 is " + operations);
        remainder = operations % 40;
        System.out.println("Remainder of (result % 40) is " + remainder);

        if (remainder <= 20)
        {
            System.out.println("Total was over the limit");
        }

        num3 = num1 * Main.pi;
        System.out.println("Using globals for " + num1 + " * " + pi + " = " + num3);

        if(num3 > 60)
        {
            System.out.println("Pi works");
        }
        else
        {
            System.out.println("Not today");
        }

    }
}
