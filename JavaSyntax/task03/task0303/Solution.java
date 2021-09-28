package com.codegym.task.task03.task0303;

/* 
Currency exchange

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(50, 20.5));
        System.out.println(convertEurToUsd(60, .5));
    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return (eur * exchangeRate);
    }
}
