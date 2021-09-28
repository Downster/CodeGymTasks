package com.codegym.task.task01.task0132;

/* 
Sum of the digits of a three-digit number

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int answer = number % 10;
        int track = number / 10;
        answer = answer + track % 10;
        answer = answer + track / 10;

        return answer;
    }
}