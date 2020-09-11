package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Create a class and demonstrate proper encapsulation techniques
        //The class will be called Printer
        //It will simulate a real computer printer
        //It should have fields for the toner lever, number of pages printed, and also
          //whether it's a duplex printer(capable of printing on both sides of the paper).
        //Add methods to fill up the toner (up to a maximum of 100%), another method to
          //simulate printing a page (which should increase the number of pages printer
        //Decide on the scope, whether to use constructors, and anything else you thing is needed.

        Toner tone = new Toner(100, "Black");
        //tone.refilling(110);
        Printer printer = new Printer(tone, true );
        System.out.println("Initial pages = " + printer.getNumberOfPages());
        //printer.setNumberOfPages(9);
        //printer.printing(tone, printer.getNumberOfPages());
        //tone.refilling(50);
        int total = 0;
        int pages = 4;
        total+=pages;
        printer.setNumberOfPages(pages);
        printer.printing(tone, printer.getNumberOfPages());
        pages = 7;
        total+=pages;
        printer.setNumberOfPages(pages);
        printer.printing(tone, printer.getNumberOfPages());
        System.out.println("Page Counter = " + ((total / 2) + 1));


        //System.out.println("\n\n");
        //Toner tony = new Toner(90, "Red");
        //Printer prntr = new Printer(tony, false);
        //prntr.setNumberOfPages(4);
        //prntr.printing(tony, prntr.getNumberOfPages());

    }
}
