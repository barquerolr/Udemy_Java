package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Code from previous video

//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        //calculateScore(gameOver, score, levelCompleted, bonus);
        //calculateScore(true, 800, levelCompleted, bonus);
        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

//        if(gameOver)
//        {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            System.out.println("Your final score was " + finalScore);
//        }
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;

        //calculateScore(gameOver, score, levelCompleted, bonus);
//        if(gameOver)
//
//
//        {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final score was " + finalScore);
//        }


        /*********************************Challenge******************************************/
        //Create a method called displayHighScorePosition
        //It should a players name as a parameter, and a 2nd parameter as a position in the high score table.
        //You should display the player's name along with a message like "managed to get into position" and the
        //position they got and a further message " on the high score table."
        //
        //Create a 2nd method called calculateHighScorePosition
        //It should receive one argument only, the player score.
        //It should return an int.
        //The return data should be
        //1. if the score is >= 1000
        //2. if the score is >= 500 and < 1000
        //3. if the score is >= 100 and < 500
        //4. In all other cases,
        //   it should call both methods and display the result of the following
        //   a score of 1500, 900, 400, 50


//        String player = "Bob";
//        String player2 = "Steve";
//        String player3 = "Billy";
//        String player4 = "Joe";
//
//        int score1 = 1500;
//        int score2 = 900;
//        int score3 = 400;
//        int score4 = 50;
//
//        int scoreBob = calculateHighScorePosition(score1);
//        System.out.println("\n" + player + "'s score is: " + score1);
//        displayHighScorePosition(player, scoreBob);
//
//        int scoreSteve = calculateHighScorePosition(score2);
//        System.out.println("\n" + player2 + "'s score is: " + score2);
//        displayHighScorePosition(player2, scoreSteve);
//
//
//        int scoreBilly = calculateHighScorePosition(score3);
//        System.out.println("\n" + player3 + "'s score is: " + score3);
//        displayHighScorePosition(player3, scoreSteve);
//
//
//        int scoreJoe = calculateHighScorePosition(score4);
//        System.out.println("\n" + player4 +"'s score is: " + score4);
//        displayHighScorePosition(player4, scoreJoe);

        int calculating = calculateHighScorePosition(1500);
        displayHighScorePosition("Billy", calculating);

        calculating = calculateHighScorePosition(900);
        displayHighScorePosition("Steve", calculating);

        calculating = calculateHighScorePosition(400);
        displayHighScorePosition("Bob", calculating);

        calculating = calculateHighScorePosition(50);
        displayHighScorePosition("Joe", calculating);

        calculating = calculateHighScorePosition(1000);
        displayHighScorePosition("Louis", calculating);

        calculating = calculateHighScorePosition(500);
        displayHighScorePosition("Peter", calculating);

        calculating = calculateHighScorePosition(100);
        displayHighScorePosition("Yeet", calculating);

    }

    //public static void calculateScore(boolean gaming, int scoring, int leveling, int bonusing)
    public static int calculateScore(boolean gaming, int scoring, int leveling, int bonusing)
    {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;

        if(gaming)
        {
            int finalScore = scoring + (leveling  * bonusing);
            finalScore += 2000;
           // System.out.println("Your final score was " + finalScore);
            return finalScore;
        }

        return -1;
    }

    public static void displayHighScorePosition(String playerName, int position)
    {
        System.out.println(playerName + " managed to get into position " + position + " on the high score table");
    }


    public static int calculateHighScorePosition(int score) {
        int position = 0;
        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        } else {
            position = 4;
        }

        return position;
    }
}
