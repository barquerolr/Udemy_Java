package com.company;

public class Vehicle {

    //steering
    //changing gears
    // moving

     private int size;
     private String name;

     private int currentVelocity;
     private int currentDirection;

     public Vehicle(int size, String name)
     {
         this.size = size;
         this.name = name;

         this.currentVelocity = 0;
         this.currentDirection = 0;
     }

    public void steer(int direction)
    {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): steering at " + currentDirection + " degree.");
    }

    public void moving(int velocity, int direction)
     {
         currentVelocity = velocity;
         currentDirection = direction;
         System.out.println("Vehicle.move(): moving at " + currentVelocity + " in direction " + currentDirection);
     }

     public void stop()
     {
         this.currentVelocity = 0;
     }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
