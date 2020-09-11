package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getGreatestCommonDivisor(25, 15);
        getGreatestCommonDivisor(12, 30);
        getGreatestCommonDivisor(9, 18);
        getGreatestCommonDivisor(81, 153);
    }

    public static int getGreatestCommonDivisor(int first, int second)
    {
        int divisor;
        int divisor2;
        int greatest = 0;

        System.out.println("\nNum1 = " + first);
        System.out.println("Num2 = " + second);

        if(first >= 10 && second >= 10)
        {
            int count = 1;
            int count2 = 1;

            while((count <= first) && (count2 <= second))
            {
                divisor = first % count;
                divisor2 = second % count2;

                if(divisor == 0 && divisor2 == 0)
                {
                    if(count > count2)
                    {
                        greatest = count;
                        System.out.println("Greatest common factor is: " + greatest);
                    }

                    else if(count2 > count)
                    {
                        greatest = count2;
                        System.out.println("Greatest common factor is: " + greatest);
                    }

                    else if(count == count2)
                    {
                        greatest = count;
                        System.out.println("They share the same common factor: " + greatest);
                    }
                }

                count++;
                count2++;
            }
        }

        else
        {
            greatest = -1;
            System.out.println("Invalid Entry");
        }

        return greatest;
    }
}
