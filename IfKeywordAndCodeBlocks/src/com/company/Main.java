package com.company;

//import jdk.javadoc.internal.doclets.formats.html.SourceToHTMLConverter;

public class Main {

    public static void main(String[] args) {
        // write your code
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score == 5000) {
            System.out.println("Your score was " + score);
        }
        if (score == 4000)
            System.out.println("Second time works"); //Do not need a {} if you only need one line after if
        System.out.println("This was executed as well");

        if (score < 5000) {
            System.out.println("Got here fam"); //Won't get executed because condition is false. Moves to else.
        } else {
            System.out.println("Psych! Got here fam");
        }

        /*************************/

        if (score <= 5000) {
            System.out.println("Your score was less than or equal to 5000");
        } else {
            System.out.println("Got here instead"); //Won't get executed because first case was true
        }

        /***************************************/

        if (score < 5000 && score > 1000) {
            System.out.println("Your score is less than 5000, but greater than 1000");
            //Wont get executed because score > 5000 (in other words, false). Also. && wont allow it to pass
            //In other words, score > 1000 and it's not less than 5000; it is 5000.
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
            //Wont get executed because score > 1000 (meaning score < 1000 is false).
        } else {
            System.out.println("Got here a third time");
            //This will get executed because the other two conditions are false.
            //Therefore, this else statement says, if no other condition is true, execute this statement.
        }

        /****************************************************************************************************/

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //int savedScore = finalScore; // Cannot do that. Variable was declared inside code block, so it gets deleted
        //after

        /***************************************Challenge***************************************************/
        //1.Print out a second score on the screen with the following:
        //score set to 10000
        //levelCompleted set to 8
        //bonus set to 200
        //But make sure the first printout above still displays as well

        System.out.println("\n");

        boolean gameOver2 = true;
        int score2 = 800;
        int levelCompleted2 = 5;
        int bonus2 = 100;

        if (gameOver2)
        {
            int finalScore = score2 + (levelCompleted2 * bonus2);
            System.out.println("Your final score was " + finalScore);
        }

        //////////One way///////////
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if(newGameOver)
        {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("\nFirst method");
            System.out.println("Your final score was " + finalScore);
        }

        ////////Second Way//////////
        score2 = 10000;
        levelCompleted2 = 8;
        bonus2 = 200;

        if(gameOver2)
        {
            int finalScore = score2 + (levelCompleted2 * bonus2);
            System.out.println("\nSecond Method");
            System.out.println("Your final score was " + finalScore);
        }

        /////////////Final Method(Using Methods)//////////////////

        boolean gameMethod = true;
        int scoreMethod = 10000;
        int levelMethod = 8;
        int bonusMethod = 200;

        score(gameOver2, score2, levelCompleted2, bonus2); //with first numbers changed accordingly 
        score(gameMethod, scoreMethod, levelMethod, bonusMethod); //with new numbers
    }

    public static void score(boolean gaming, int scoring, int leveling, int bonusing)
    {
       if(gaming)
       {
           int finalScore = scoring + (leveling * bonusing);
           System.out.println("\nThird and final method using methods");
           System.out.println("Your final score was " + finalScore);
       }
    }
}
