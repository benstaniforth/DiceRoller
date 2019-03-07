package benstaniforth.DiceRoller;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the dice roller");

        System.out.println("How many sided dice would you like to use?? > ");
        int sidesOnDice = getNumberFromUser();

        System.out.println("How many dice would you like to roll?? > ");
        int numberOfDice = getNumberFromUser();

        System.out.println("You rolled a total of > ");
        calculateSumOfRolls(numberOfDice, sidesOnDice);

    }


    public static int randomRoll (int sidesOnDice) {
        // Returns random number between 1 and 6
        Random random = new Random();
        return random.nextInt(sidesOnDice) + 1;
    }


    public static int getNumberFromUser () {
        // Prompts user for number input
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void displayMultipleDiceRolls (int numberOfDice, int sidesOnDice) {
        // Outputs random rolls depending on number selected
        for (int diceRolled = 0; diceRolled < numberOfDice; diceRolled++ ) {
            System.out.println(randomRoll(sidesOnDice));

        }
    }

    public static void calculateSumOfRolls (int numberOfDice, int sidesOnDice) {

        // Calculates the sum of all the numbers rolled
        int sumOfRolls = 0;
        for (int diceRolled = 0; diceRolled < numberOfDice; diceRolled++) {
            sumOfRolls += (randomRoll(sidesOnDice));
        }
        
        System.out.println(sumOfRolls);


    }


}
