package com.numguess.numguess;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class NumberGuessingGame {
    private final int min=1;
    private final int max=100;
    private final int targetNumber;
    private int numberOfTries;

    public NumberGuessingGame() {
        this.targetNumber = new Random().nextInt((max - min) + 1) + min;
        this.numberOfTries = 0;
    }

    public String guess(int guess) {
        numberOfTries++;
        if (guess < min || guess > max) {
            return "Your guess is out of range!";
        } else if (guess < targetNumber) {
            return "Try a higher number.";
        } else if (guess > targetNumber) {
            return "Try a lower number.";
        } else {
            return "Congratulations! You guessed the number in " + numberOfTries + " tries.";
        }
    }

    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }
}
