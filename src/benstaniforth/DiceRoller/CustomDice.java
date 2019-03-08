package benstaniforth.DiceRoller;

import java.util.List;

public class CustomDice implements Dice {

    int numberOfSides;
    List<Integer> customFaces;

    public CustomDice(int numberOfSides, List<Integer> customFaces) {
        this.numberOfSides = numberOfSides;
        this.customFaces = customFaces;
    }

    @Override
    public int roll() {


        return 0;
    }
}
