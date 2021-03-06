/*
 * CS2050 - Computer Science II - Summer 2020
 * Instructor: Thyago Mota
 * Description: Homework 01 - Dice
 */

import java.util.Random;

public class Dice {

    private int sides;
    private int value;

    // constants
    public static final int DEFAULT_INITIAL_VALUE         = 1;
    public static final int DEFAULT_MINIMUM_NUMBER_SIDES  = 2;
    public static final int DEFAULT_NUMBER_SIDES          = 6;

    // TODO: users should be able to create a dice given its number of sides.
    //  If the informed value is < 2, set it to 2.
    public Dice(int sides) {
        if (sides < DEFAULT_MINIMUM_NUMBER_SIDES) {
            this.sides = DEFAULT_MINIMUM_NUMBER_SIDES;
        }
        else {
            this.sides = sides;
        }
        this.value = DEFAULT_INITIAL_VALUE;
    }

    // TODO: users should also be able to create a dice without informing its number of sides
    //  (in that case, set the number of sides to 6).
    public Dice() {
        this.sides = DEFAULT_NUMBER_SIDES;
        this.value = DEFAULT_INITIAL_VALUE;
    }

    // TODO: finish the method implementation
    public int getValue() {
        return value;
    }

    // TODO: finish the method implementation
    public void roll() {
        value = (int)(Math.random()* sides) + 1;
    }

    @Override
    public String toString() {
        return "Dice{" +
                "sides=" + sides +
                ", value=" + value +
                '}';
    }
}
