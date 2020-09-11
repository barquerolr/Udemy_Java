package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int count = 0;
        int sum = 0;
        for(int i = 1; i < 1000; i = i + 1)
        {
            if( (i % 3 == 0) && (i % 5 == 0))
            {
                System.out.println("Number " + i + " can be divided by 3 and 5");
                count++;
                sum+=i;
                //System.out.println("Summing all numbers = " + numbers);
                if(count == 5)
                {
                    System.out.println("There were at least " + count + " numbers");
                    //System.out.println("Summing all numbers = " + numbers);
                    break;
                }
            }
        }

        System.out.println("Summing all numbers = " + sum);
    }
}
