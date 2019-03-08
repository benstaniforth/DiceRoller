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

//
//        if (diceTypeChoice.equalsIgnoreCase("custom")) {
//
//                System.out.println("How many sided dice would you like to use? > ");
//                int sidesOnCustomDice = Integer.parseInt(getInputFromUser());
//
//                System.out.println("Please enter the values you would like to be on the faces > ");
//                List<Integer> customValues = getCustomFacesChoice(sidesOnCustomDice);
//
//        System.out.println("How many dice would you like to roll? > ");
//        int numberOfCustomDice = Integer.parseInt(getInputFromUser());
//
//        System.out.println("You rolled a total of > ");
//        calculateSumOfCustomRolls(numberOfCustomDice, customValues);
//
//
//        } else {
//        System.out.println("How many sided dice would you like to use? > ");
//        int sidesOnDice = Integer.parseInt(getInputFromUser());
//
//        System.out.println("How many dice would you like to roll? > ");
//        int numberOfDice = Integer.parseInt(getInputFromUser());
//
//        System.out.println("You rolled a total of > ");
//        calculateSumOfStandardRolls(numberOfDice, sidesOnDice);
//        }
//
//    public static int randomRoll (int sidesOnDice) {
//        // Returns random number between 1 and 6
//        Random random = new Random();
//        return random.nextInt(sidesOnDice) + 1;
//    }

//    public static List<Integer> getCustomFacesChoice (int sidesOnCustomDice) {
//
//        List<Integer> customFaces = new ArrayList<>();
//
//        for (int i = 0; i < sidesOnCustomDice; i++){
//            customFaces.add(Integer.valueOf(getInputFromUser()));
//        }
//
//        return customFaces;
//
//    }
//
//public static void calculateSumOfStandardRolls (int numberOfDice, int sidesOnDice) {
//
//        // Calculates the sum of all the numbers rolled
//        int sumOfStandardRolls = 0;
//        for (int diceRolled = 0; diceRolled < numberOfDice; diceRolled++) {
//            sumOfStandardRolls += (randomRoll(sidesOnDice));
//        }
//
//        System.out.println(sumOfStandardRolls);
//    }
//
//        public static void calculateSumOfCustomRolls (int numberOfCustomDice, List<Integer> customFaces) {
//
//        int sumOfCustomRolls = 0;
//        for (int diceRolled = 0; diceRolled < numberOfCustomDice; diceRolled++){
//            sumOfCustomRolls += customFaces.get(randomRoll(customFaces.size())-1);
//        }
//
//        System.out.println(sumOfCustomRolls);
//    }