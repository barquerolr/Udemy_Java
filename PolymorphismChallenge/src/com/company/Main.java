package com.company;

class Car{
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;
    private int speed;

    public Car(String name, int cylinders)
    {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public void startEngine()
    {
        System.out.println("Car -> starting car");
        this.speed = 0;
    }

    public void accelerate(int velocity)
    {
        this.speed = velocity;
        System.out.println("Car -> car is accelerating to " + velocity);
    }

    public void brake()
    {
        System.out.println("Car -> Braking ");
        this.speed = 0;
    }
}

class Ferrari extends Car{
    public Ferrari(String name, int cylinders) {
        super("Ferrari", cylinders);
    }

    @Override
    public void startEngine() {
        System.out.println("Ferrari -> Starting engine. Listen to her purr" );
    }

    @Override
    public void accelerate(int velocity) {
        //super.accelerate(velocity);
        System.out.println("Ferrari -> Accelerating car ");
        System.out.println("VROOOOOOOOOM " + velocity);
    }

    @Override
    public void brake() {
        System.out.println("Ferrari -> Brakes applied!!!!!!!!");
        int speed = 0;
        System.out.println("Ferrari -> Car came to a complete stop, " + speed + " MPH");
    }
}

class Porsche extends Car{
    public Porsche(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        //super.startEngine();
        System.out.println("Porsche -> Turning keys, starting engine......");
        int speed = 0;
        System.out.println("Speed is now 0, but listen the engine.......");
    }

    @Override
    public void accelerate(int velocity) {
        //super.accelerate(velocity);
        System.out.println("Porsche -> Lead Foot -> Accelerating ...............");
        System.out.println("Porsche -> Car is now at " + velocity + " MPH");
    }

    @Override
    public void brake() {
        //super.brake();
        System.out.println("Porsche -> Applying brakes.......");
        int speed = 0;
        System.out.println("Porshce -> Car is now at " + speed + " MPH. Awaiting instructions");
    }
}

class Tesla extends Car{
    public Tesla(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public void startEngine() {
        //super.startEngine();
        System.out.println("Tesla -> This is an electric car, so after finally finishing charging, the car is now " +
                           "starting");
        System.out.println("Tesla -> Speed is at 0");
    }

    @Override
    public void accelerate(int velocity) {
        //super.accelerate(velocity);
        System.out.println("Tesla -> The battery is kicking in, and we are accelerating to " + velocity + " MPH");
    }

    @Override
    public void brake() {
        //super.brake();
        System.out.println("Tesla -> The brakes applied, no need for autopilot. We now at 0 MPH");
    }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
        //We are going to go back to the car analogy
        //Create a base class called Car
        //It should have a few fields that would be appropriate for a generic car class
        //engine, cylinders, wheels, etc.
        //Constructor should initialize cylinders (number of) and name, and set wheels to 4.
          //and engine to true. Cylinders and names would be passed parameters.
        //
        //Create appropriate getters
        //
        //Create some methods like startEngine, accelerate, brake
        //
        //Show a message for each in the base class
        //Now create 3 subclasses for your favorite vehicles
        //Override the appropriate methods to demonstrate Polymorphism in use.
        //Put all classes in the one Java file(this one).

        Car car = new Car("Luis", 4);
        car.startEngine();
        car.accelerate(55);
        car.brake();
        System.out.println("\n");

        Ferrari ferrari = new Ferrari("Enzo", 8);
        ferrari.startEngine();
        ferrari.accelerate(100);
        ferrari.brake();
        System.out.println("\n");

        Porsche porsche = new Porsche("911 Carrera", 8);
        porsche.startEngine();
        porsche.accelerate(90);
        porsche.brake();
        System.out.println("\n");

        Tesla tesla = new Tesla("Truck", 100);
        tesla.startEngine();
        tesla.accelerate(250);
        tesla.brake();
    }
}
