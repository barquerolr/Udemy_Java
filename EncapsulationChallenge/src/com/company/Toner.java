package com.company;

public class Toner {
    private int percentage = 50;
    private String color;

    public Toner(int percentage, String color) {
        if(this.percentage >= 1 && this.percentage <= 100)
        {
            this.percentage = percentage;
        }

        else
        {
            this.percentage = -1;
        }

        this.color = color;
    }

    public int refilling(int tonerAmount)
    {
        if(tonerAmount > 0 && tonerAmount <= 100)
        {
            if (this.percentage + tonerAmount >= 100)
            {
                System.out.println("Error. Refilling amount is > 100");
                return -1;
            }

            System.out.println("Refilling the toner....");
            this.percentage = this.percentage + tonerAmount;
            System.out.println("New percentage = " + this.percentage);
        }

        else
        {
            System.out.println("Error. Refilling amount is > 100");
            return -1;
        }

        return this.percentage;
    }

    public int producing()
    {
        if(this.percentage > 0 && this.percentage <= 100)
        {
            System.out.println("Using the toner....");
            this.percentage = this.percentage - 5;
            System.out.println("Percentage left " + this.percentage);
        }

        else if(this.percentage <= 0)
        {
            this.percentage = 0;
            System.out.println("No more toner.....Cancelling printing job..... Sad Face......");
        }

        return this.percentage;
    }

    public int producingDuplex()
    {
        if(this.percentage > 0 && this.percentage <= 100)
        {
            System.out.println("Using the toner....");
            this.percentage = this.percentage - 10;
            System.out.println("Percentage left " + this.percentage);
        }

        else if(this.percentage <= 0)
        {
            this.percentage = 0;
            System.out.println("No more toner.....Cancelling printing job..... Sad Face......");
        }

        return this.percentage;
    }

    public int getPercentage() {
        return percentage;
    }

    public String getColor() {
        return color;
    }
}
