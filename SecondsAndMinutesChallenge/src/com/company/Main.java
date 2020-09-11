package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
	// write your code here

      // String printing = getDurationString(96, 7);
      // System.out.println(printing);
        String print = getDurationString(4);
        print = getDurationString(500);
        print = getDurationString(1600);
        print = getDurationString(3600);
        print = getDurationString(-1);
        print = getDurationString(0);
        print = getDurationString(8540);
        print = getDurationString(3945);
        //System.out.println(print);
        //System.out.println(getDurationString(3945);
    }

    public static String getDurationString(int minutes, int seconds)
    {
        int totalHours;
        int totalMins;
        int totalSecs ;
        int hoursConversion;
        //String conversion;
        String hrs;
        String mins;
        String secs;
        String time;


        if (minutes >= 0 && (seconds >= 0 && seconds <= 59))
        {
            hoursConversion = minutes % 60;
            totalHours = (minutes - hoursConversion) / 60;
            totalMins = hoursConversion;
            totalSecs = seconds;

            hrs = totalHours + "h";
            if(totalHours < 10)
            {
                hrs = "0" + hrs;
            }

            mins = totalMins + "m";
            if(totalMins < 10)
            {
                mins = "0" + mins;
            }

            secs = totalSecs + "s";
            if(totalSecs < 10)
            {
                secs = "0" + secs;
            }

            time = hrs + " " + mins + " " + secs;
            //conversion = (totalHours + "h " + totalMins + "m " + totalSecs + "s");
            // return totalHours + "h " + totalMins + "m " + totalSecs + "s";
        }

        else
        {
            //time = ("Invalid Entry");
            return INVALID_VALUE_MESSAGE;
        }

        return time;
        //return "Invalid Entry";
    }

    public static String getDurationString(int seconds)
    {
        int conversion;
        int minutes;
        int remainingSeconds;
        String result;
        String time;

        if(seconds >= 0)
        {
            conversion = seconds % 60;
            minutes = (seconds - conversion) / 60;
            remainingSeconds = conversion;
            result = (seconds + " seconds = " + minutes + " mins and " + remainingSeconds + " secs");
            System.out.println(result);
            time = getDurationString(minutes, remainingSeconds);
            System.out.println(time + "\n");
            //return getDurationString(minutes, seconds); //returning the value, not the method.
        }

        else
        {
            //time = "Invalid Value";
            //System.out.println(time + "\n");
            System.out.println(INVALID_VALUE_MESSAGE + "\n");
            return INVALID_VALUE_MESSAGE;
        }

        return time;
    }
}
