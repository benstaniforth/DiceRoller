package benstaniforth.DiceRoller;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the dice roller");

        System.out.println("You've rolled a " + randomRoll());




    }

    public static int randomRoll () {

        // Returns random number between 1 and 6
        Random random = new Random();
        int randomNumber = random.nextInt((6-1)+1) + 1;

        return randomNumber;

    }

}
