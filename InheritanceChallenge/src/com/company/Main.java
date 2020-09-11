package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Challenge
        //Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        //Finally, create another class, a specific type of Car that inherits from the Car class.
        //You should be able to hand steering, changing gears, and moving (speed in other words).
        //You still want to decide where to put the appropriate state and behaviors (fields and methods).
        //As mentioned above, changing gears, increasing/decreasing speed should be included.
        //For your specific type of vehicle, you will want to add something specific for that type of car

        Nissan nissan = new Nissan(36);
        nissan.steer(45);
        nissan.accelerate(30);
        nissan.accelerate(20);
        nissan.accelerate(-42);
    }
}
