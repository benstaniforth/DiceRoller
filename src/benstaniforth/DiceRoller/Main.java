package benstaniforth.DiceRoller;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the dice roller");

        System.out.println("Would you like to use a standard or custom dice? > ");
        Boolean isCustom = getInputFromUser().equalsIgnoreCase("Custom");


        Dice dice = isCustom ? getCustomDiceFromUser() : getStandardDiceFromUser();
        System.out.println("How many rolls would you like?");
        int numberOfRolls = Integer.parseInt(getInputFromUser());
        int totalRoll = calculateTotalRoll(dice, numberOfRolls);

        System.out.println("You rolled a total value of > " + totalRoll);

    }


    public static String getInputFromUser () {
        // Prompts user for number input
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


    private static Dice getCustomDiceFromUser () {

        List <Integer> customFaces = new ArrayList<>();

        System.out.println("How many sides would you like your dice to have? >");
        int numberOfSides = Integer.parseInt(getInputFromUser());

        System.out.println("Please enter the values you would like to be on the faces > ");
        for (int i = 0; i < numberOfSides; i++){
            customFaces.add(Integer.valueOf(getInputFromUser()));
        }

        return new CustomDice(numberOfSides, customFaces);
    }



    private static Dice getStandardDiceFromUser () {

        System.out.println("How many sides would you like your dice to have? >");
        int numberOfSides = Integer.parseInt(getInputFromUser());

        return new StandardDice(numberOfSides);
    }



    private static int calculateTotalRoll (Dice dice, int numberOfRolls) {

        int sumOfRolls = 0;
        for (int i = 0; i < numberOfRolls; i++) {
            sumOfRolls += dice.roll();
        }

        return sumOfRolls;
    }

}
