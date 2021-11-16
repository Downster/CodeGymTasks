package com.codegym.task.task14.task1408;

public class EuropeanHen extends Hen implements Continent {
    @Override
    public int getMonthlyEggCount() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "I am a chicken. I come from " + EUROPE + ". I lay " + this.getMonthlyEggCount() + " eggs a month.";
    }
}
