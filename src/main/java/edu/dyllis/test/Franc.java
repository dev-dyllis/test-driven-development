package edu.dyllis.test;

public class Franc extends Money {
    Franc(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Franc(this.amount * multiplier);
    }
}