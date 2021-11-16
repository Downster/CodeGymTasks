package com.codegym.task.task14.task1408;

public class AfricanHen extends Hen implements Continent{
    @Override
    public int getMonthlyEggCount() {
        return 6;
    }

    @Override
    public String getDescription() {
        return "I am a chicken. I come from " + AFRICA + ". I lay " + this.getMonthlyEggCount() + " eggs a month.";
    }
}
