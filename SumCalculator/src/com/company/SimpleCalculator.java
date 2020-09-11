package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    //Setting first number
    public void setFirstNumber(double firstNumber)
    {
        this.firstNumber = firstNumber;

    }

    //Getting first number
    public double getFirstNumber()
    {
        return this.firstNumber;
    }

    //Setting second number
    public void setSecondNumber(double secondNumber)
    {
        this.secondNumber = secondNumber;
    }

    //Getting second number
    public double getSecondNumber()
    {
        return this.secondNumber;
    }

    //Result from adding the two numbers
    public double getAdditionResult()
    {
        return (this.firstNumber + this.secondNumber);
    }

    //Result from subtracting the two numbers
    public double getSubtractionResult()
    {
        return (this.firstNumber - this.secondNumber);
    }

    //Result from multiplying both numbers
    public double getMultiplicationResult()
    {
        return (this.firstNumber * this.secondNumber);
    }

    //Result from dividing both numbers
    public double getDivisionResult()
    {
        if(this.secondNumber == 0)
        {
            return 0;
        }

        return (this.firstNumber / this.secondNumber);
    }

}
