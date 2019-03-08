package benstaniforth.DiceRoller;

import java.util.Random;

public class StandardDice implements Dice {

    int numberOfSides;

    public StandardDice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    @Override
    public int roll() {
        Random random = new Random();
        return random.nextInt(numberOfSides) + 1;
    }
}
