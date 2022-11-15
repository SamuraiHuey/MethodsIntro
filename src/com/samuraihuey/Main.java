package com.samuraihuey;

public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Challenge
        // Create a method called displayHighScorePosition
        // it should receive a players name as a parameter, and a 2nd parameter as a position in the high score table
        // you should display the players name with a message stating what position they received
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an int
        // the return data should be
        // 1 if >1000
        // 2 if >500 and <1000
        // 3 if >100 and < 500
        // 4 for all other cases
        // call both methods and display the results of the following
        // 1500, 900, 400, 50


        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Lewis", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Toby", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Keith", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Mike", position);

    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName + " got into position " + position + " on the high score table!");

    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        //Alt approach with single return
        int position = 4;

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }
}