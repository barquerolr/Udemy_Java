package com.company;

public class Printer {
    private Toner tonerLevels;
    private int numberOfPages;
    private boolean isDuplex;

    public Printer(Toner tonerLevels, boolean isDuplex) {
        this.tonerLevels = tonerLevels;
        this.isDuplex = isDuplex;
        this.numberOfPages = 0;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public Toner getTonerLevels() {
        return tonerLevels;
    }

    public boolean isDuplex() {
        return isDuplex;
    }

    public int printing(Toner tonerLevels, int numpages) {
        int print = 0;
        int pagesPrinted = numpages;

        System.out.println("Pages to print: " + pagesPrinted);
        if (isDuplex)
        {
            pagesPrinted = (pagesPrinted / 2) + (pagesPrinted % 2);
            //pagesPrinted = pagesPrinted / 2;
            while (print < pagesPrinted && tonerLevels.getPercentage() > 0)
            {
                System.out.println("Printing on both sides(Duplex).....");
                System.out.println("Page: " + (print + 1));
                tonerLevels.producingDuplex();
                print += 1;
            }
        }

        else
        {
            while (print < pagesPrinted && tonerLevels.getPercentage() > 0)
            {
                System.out.println("Printing on one side(Not a Duplex).....");
                System.out.println("Page: " + (print + 1));
                tonerLevels.producing();
                print += 1;
            }
        }

        System.out.println("Total number of pages printed: " + print);
        System.out.println("Percentage left after printing job: " + tonerLevels.getPercentage());

        return this.numberOfPages + print;

        //this.numberOfPages+=pagesPrinted;
        //System.out.println("Pages Counter = " + this.numberOfPages);

    }
}
