package com.company;

class Movie{
    private String name;

    public Movie(String name)
    {
        this.name = name;
    }

    public String plot()
    {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie{
    public Jaws()
    {
        super("Jaws");
    }

    public String plot()
    {
        return "A shark eats lots of people";
    }
}

class IndependenceDay extends Movie{
    public IndependenceDay()
    {
        super("Independence Day");
    }

    @Override
    public String plot() {

        return "Aliens attempt to take over Planet Earth";
    }
}

class MazeRunner extends Movie{
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie{
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class ForgettableMovie extends Movie{
    public ForgettableMovie() {
        super("Forgettable Movie");
    }

    //No plot movie
}


public class Main {

    public static void main(String[] args) {
	// write your code here

        for (int i = 1; i<11; i++)
        {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + ": " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
            //Movie.plot() is the definition of how polymorphism works

            //Polymorphism: We are assigning different functionality, depending on the type of object we've created

            //All these objects are inherited from the base Movie class, but we've assigned a unique bit of
                //functionality in each of those plot methods, for each of those classes

            //What this is doing is: Java looks at the object movie created from the function. Then, it looks to see
                //if the object has a plot method. Since 4 out of the 5 do, it executes the corresponding plot method.
            //For forgettable movie, Java realizes there is no overridden plot method, but it sees it inherited from
                //Movie, so it finds the plot method in Movie and executes it.

            //Polymorphism: If you are inheriting from another class, and you've got a method, and you override that
                //method, then that's what Polymorphism is.
                //It is giving unique functionality to the class that has inherited from a base class.
        }
    }


    //////Static method because it is part of Main.java and not a separate class
    public static Movie randomMovie()
    {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch(randomNumber)
        {
            case 1:
                return new Jaws(); //No break because we are returning(breaking)

            case 2:
                return new IndependenceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new ForgettableMovie();

            //default:
                //return null;
        }

        return null; //It could have other values, even though we tested for values between 1 and 5
    }
}
