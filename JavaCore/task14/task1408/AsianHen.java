package com.codegym.task.task14.task1408;

public class AsianHen extends Hen implements Continent{
    @Override
    public int getMonthlyEggCount() {
        return 8;
    }

    @Override
    public String getDescription() {
        return "I am a chicken. I come from " + ASIA + ". I lay " + this.getMonthlyEggCount() + " eggs a month.";
    }
}
