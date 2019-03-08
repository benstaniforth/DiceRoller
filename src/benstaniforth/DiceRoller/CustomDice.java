package benstaniforth.DiceRoller;

import java.util.List;
import java.util.Random;

public class CustomDice implements Dice {

    int numberOfSides;
    List<Integer> customFaces;

    public CustomDice(int numberOfSides, List<Integer> customFaces) {
        this.numberOfSides = numberOfSides;
        this.customFaces = customFaces;
    }

    @Override
    public int roll() {

        Random random = new Random();
        return customFaces.get(random.nextInt(numberOfSides));

    }
}
