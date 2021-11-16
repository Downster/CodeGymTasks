package com.codegym.task.task14.task1408;

/* 
Chicken factory

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        System.out.println(hen.getMonthlyEggCount());
    }



    static class HenFactory {

        static Hen getHen(String continent) {
            if (continent.equals("North America")){
                return new NorthAmericanHen();
            } else if (continent.equals(Continent.AFRICA)){
                return new AfricanHen();
            } else if (continent.equals("Asia")){
                return new AsianHen();
            } else if (continent.equals("Europe")){
                return new EuropeanHen();
            } else {
                return null;
            }

        }
    }


}
