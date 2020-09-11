package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        shouldWakeUp(true, 1);
        shouldWakeUp(false, 2);
        shouldWakeUp(true, 8);
        shouldWakeUp(true, -1);
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay)
    {
        boolean waking;
        if(hourOfDay > 23 || hourOfDay < 0)
        {
            waking = false;
            System.out.println("23 and 0 Barking = " + waking);
            //return barking;
        }

        else if((hourOfDay < 8 || hourOfDay > 22) && (barking == true))
        {
            waking = true;
            System.out.println("8 and 22 Barking = " + waking);

            //return barking;
        }

        else
        {
            waking = false;
            System.out.println("Barking = " + waking);
        }


        return waking;
    }
}
