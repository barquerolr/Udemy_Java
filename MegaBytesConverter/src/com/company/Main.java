package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        printMegaBytesAndKiloBytes(2500);
        printMegaBytesAndKiloBytes(-1024);
        printMegaBytesAndKiloBytes(5000);
        printMegaBytesAndKiloBytes(0);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes)
    {
        if(kiloBytes >= 0)
        {
            int conversion = 1024;
            int megaBytes = kiloBytes / conversion;
            int remaining = kiloBytes % conversion;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remaining + " KB");
        }

        else if(kiloBytes < 0)
            System.out.println("Invalid Value");
    }
}
