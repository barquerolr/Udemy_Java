package com.company;

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        canPack(2, 0, 9);
        canPack(1, 0, 4);
        canPack(1, 0, 5);
        canPack(0, 5, 4);
        canPack(2, 2, 11);
        canPack(-3, 2, 12);
        canPack(0, 5, 6);
        canPack(5, 3, 24);
        canPack(4, 18, 19);
        canPack(2,1,5);
        canPack(2,1,12);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal)
    {
        //bigCount represents big flour bags(5 kilos each)
        //smallCount represents the count of small flour bags(1 kilo each)
        //goal represents the goal amount of kilos of flour needed to assemble a package
        //therefore, the sum of bigCount and smallCount must be at least equal to value of goal
        //method returns true if it's possible to make a package with goal kilos of flour

        boolean packing = false;
        int big = 0;
        int small = 0;
        int total = 0;
        int sum = 0;
        int sub = 0;
        int diff = 0;

        if(bigCount < 0 || smallCount < 0 || goal < 0)
        {
            System.out.println("\nInvalid Entry");
            return packing;
        }

        big = bigCount * 5;
        small = smallCount;
        sum = big + small;

        System.out.println("\nBig = " + big);
        System.out.println("Small = " + small);
        System.out.println("Goal = " + goal);
        System.out.println("Total = " + sum);

        while(goal >= 0)
        {
            if(big > goal)
            {
                sub = big - 5;
                diff = goal - sub;
                if(small >= diff)
                {
                    packing = true;
                    System.out.println("Goal is reachable");
                }

                else
                {
                    packing = false;
                    System.out.println("Goal is not reachable");
                }
            }

            else if(big == 0)
            {
                if(goal > small)
                {
                    packing = false;
                    System.out.println("Goal is not reachable");
                }

                else
                {
                    packing = true;
                    System.out.println("Goal is reachable");
                }

                return packing;
            }

            else
            {
                if(sum >= goal)
                {
                    total = goal - big;
                    if(sum >= total)
                    {
                        packing = true;
                        System.out.println("Goal is reachable");
                    }

                    else
                    {
                        packing = false;
                        System.out.println("Goal is not reachable");
                    }
                }

                else
                {
                    packing = false;
                    System.out.println("Goal is not reachable");
                }

                return packing;

            }

            goal = goal - big;
            goal = goal - small;
        }

        return packing;
    }
}
