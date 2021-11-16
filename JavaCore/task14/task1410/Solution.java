package com.codegym.task.task14.task1410;

/* 
Wine tasting

*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getCelebrationName());
        System.out.println(getSparklingWine().getCelebrationName());
        System.out.println(getWine().getCelebrationName());
    }

    public static Drink getDeliciousDrink() {
        Wine drink = new Wine();
        return drink;
    }

    public static Wine getWine() {
        Wine wine = new Wine();
        return wine;

    }

    public static Wine getSparklingWine() {
        Wine sparkles = new SparklingWine();
        return sparkles;
    }
}
