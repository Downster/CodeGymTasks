package com.codegym.task.task14.task1408;

public class NorthAmericanHen extends Hen implements Continent{
    @Override
    public int getMonthlyEggCount() {
        return 3;
    }
    public String getDescription() {
        return "I am a chicken. I come from " + NORTHAMERICA + ". I lay " + this.getMonthlyEggCount() + " eggs a month.";
    }
    }


