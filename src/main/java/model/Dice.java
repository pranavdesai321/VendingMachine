package model;

public class Dice {
    private int maxValue;

    public Dice(int maxValue) {
        this.maxValue = maxValue;
    }

    public int rollDice() {
        return (int)Math.floor(Math.random()*(this.maxValue + 1));
    }
}
