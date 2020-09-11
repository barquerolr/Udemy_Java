package com.company;

public class Point {
    private int x;
    private int y;

    public Point()
    {

    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x)
    {
        this.x = x;
    }

    public void setY(int y)
    {
        this.y = y;
    }

    public double distance()
    {
        int x2 = 0;
        int y2 = 0;
        double distance;
        distance = Math.sqrt((x2 - this.x) * (x2 - this.x) + (y2 - this.y) * (y2 - this.y));

        return distance;
    }

    public double distance(int x, int y)
    {
        double distance;
        distance = Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));

        return distance;
    }

    public double distance(Point another)
    {
        double distance;
        distance = Math.sqrt((another.getX() - this.x) * (another.getX() - this.x) +
                (another.getY() - this.y) * (another.getY() - this.y));

        return distance;
    }

}
