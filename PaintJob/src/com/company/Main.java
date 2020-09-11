package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int bucket;
        bucket = getBucketCount(2.75,3.25, 2.5, 1);
        System.out.println("Total buckets: " + bucket);

        int buckets;
        buckets = getBucketCount(7.25, 4.3, 2.35);
        System.out.println("\nTotal buckets: " + buckets);

        int bkts;
        bkts = getBucketCount(3.26, 0.75);
        System.out.println("\nTotal buckets: " + bkts);

    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets)
    {
        int buckets = 0;
        double area;
        double calculation;
        double extra;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
        {
            buckets = -1;
        }

        else
        {
            area = width * height;
           // System.out.println("Area = " + area);

            calculation = area / areaPerBucket;
            //System.out.println("Division = " + calculation);

            extra = Math.ceil(calculation - extraBuckets);
           // System.out.println("Buckets remaining = " + extra);

            buckets = (int) extra;
            //System.out.println("Buckets to buy = " + buckets);
        }

        return buckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket)
    {
        int buckets = 0;
        double area;
        double division;

        if(width <= 0 || height <= 0 || areaPerBucket <= 0)
        {
            buckets = -1;
        }

        else
        {
            area = width * height;
           // System.out.println("Area = " + area);

            division = Math.ceil(area / areaPerBucket);
           // System.out.println("Division = " + division);

            buckets = (int)division;
            //System.out.println("Buckets to buy = " + buckets);

        }

        return buckets;
    }

    public static int getBucketCount(double area, double areaPerBucket)
    {
        int buckets = 0;
        double division;

        if(area <= 0 || areaPerBucket <= 0)
        {
            buckets = -1;
        }

        else
        {
            division = Math.ceil(area / areaPerBucket);
            buckets = (int)division;
        }

        return buckets;
    }
}
