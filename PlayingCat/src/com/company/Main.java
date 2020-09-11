package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        isCatPlaying(true, 10);
        isCatPlaying(false, 36);
        isCatPlaying(false, 35);
        isCatPlaying(true, 38);
    }

    public static boolean isCatPlaying(boolean summer, int temperature)
    {
        boolean playing;
        if((summer == true) && ((temperature >= 25) && (temperature <= 45)))
        {
            playing = true;
            System.out.println(playing + ": It's summer, and the cat is playing");
        }

        else if((summer == false) && ((temperature >= 25) && (temperature <= 35)))
        {
            playing = true;
            System.out.println(playing + ": It's not summer, but the cat is playing");
        }

        else
        {
            playing = false;
            System.out.println(playing + ": The cat is not playing because the temperature is not in range");
        }

        return playing;
    }
}
