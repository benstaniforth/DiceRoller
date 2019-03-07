package benstaniforth.DiceRoller;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the dice roller");

        System.out.println("How many dice would you like to roll?? > ");

        int numberOfDice = howManyDiceToRoll();

        System.out.println("You rolled the following > ");
        displayMultipleDiceRolls(numberOfDice);
    }


    public static int randomRoll () {

        // Returns random number between 1 and 6
        Random random = new Random();
        return random.nextInt(6) + 1;

    }

    public static int howManyDiceToRoll () {
        // Prompts user for number of dice and outputs dice rolls
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void displayMultipleDiceRolls (int numberOfDice) {

        for (int diceRolled = 0; diceRolled < numberOfDice; diceRolled++ ) {
            System.out.println(randomRoll());

        }

    }


}
