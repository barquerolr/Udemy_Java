package com.company;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private int currentGears;
    private boolean isManual;

    public Car(int size, String name, int wheels, int doors, int gears,boolean isManual) {
        super(size, name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGears = 1;
        this.isManual = isManual;
    }

    public void changeGear(int currentGears) {
        this.currentGears = currentGears;
        System.out.println("Car.setCurrentGear(): Change to " + this.currentGears + " gears");
    }

    public void changeVelocity(int speed, int direction)
    {
        System.out.println("Car.changeVelocity(): Velocity " + speed + " direction " + direction);
        moving(speed, direction);
    }

   /* @Override
    public void stop() {
        super.stop();
    }*/
}
