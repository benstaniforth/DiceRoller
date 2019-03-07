package benstaniforth.DiceRoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the dice roller");

        System.out.println("How many dice would you like to roll?? > ");

        System.out.println("You rolled the following > " + HowManyDiceToRoll());

    }


    public static int randomRoll () {

        // Returns random number between 1 and 6
        Random random = new Random();
        return random.nextInt(6) + 1;

    }

    public static List<Integer> HowManyDiceToRoll () {

        // Prompts user for number of dice and outputs dice rolls

        Scanner scanner = new Scanner(System.in);
        int numberOfRolls = scanner.nextInt();

        List<Integer> diceRolled = new ArrayList<>();

        for (int i = 0; i < numberOfRolls; i++ ) {
            diceRolled.add(randomRoll());

        }

        return diceRolled;
        

    }


}
