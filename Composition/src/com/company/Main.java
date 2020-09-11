package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(20, 5, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions );
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-200", "ASUS", 4, 6, "v2.44");
        PC thePC = new PC(theCase, theMonitor,theMotherboard);
        //thePC.getMonitor().drawPixelAt(1500,1200, "red");
        //thePC.getMotherboard().loadProgram("Windows 1.0");
        //thePC.getTheCase().pressPowerBUtton();
        thePC.powerUP();

        /***************************Challenge***************************************/
        //Create a single room of a house using Composition
        //Think about the things that should be included in the room
        //Maybe physical parts of the house but furniture as well
        //Add at least one method to access an object via a getter and
          //then that object's public method as you saw in the previous video
        //Then add at least one method to hide the object, e.g., not using the getter
          //but to access the object used in Composition within the Main class.
          //like you saw in this video.

       Oven theOven = new Oven("Elite", "Kenmore", 500);
       Fridge theFridge = new Fridge("Elite X", "Whirlpool", 1500, 800);
       Microwave mw = new Microwave("ELitas", "Dyson", 500, 4, 5, 6);
       Kitchen kt = new Kitchen(mw, theFridge,theOven);
       kt.microw(800);
       kt.getOvenType().preheating(780);


       /*******************************************************************************/
       Wall wall1 = new Wall("West");
       Wall wall2 = new Wall("East");
       Wall wall3 = new Wall("South");
       Wall wall4 = new Wall("North");

       Ceiling ceiling = new Ceiling(12,55);

       Bed bed = new Bed("Modern", 4,3,2,1);

       Lamp lamp = new Lamp("Classic", false, 75);

       Bedroom bedroom = new Bedroom("Luis's", wall1,wall2,wall3,wall4,ceiling,bed,lamp);
       bedroom.makeBed();
       bedroom.getLamp().turnOn();
    }
}
