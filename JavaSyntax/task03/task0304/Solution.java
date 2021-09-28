package com.codegym.task.task03.task0304;

/* 
Task with percentages

*/

public class Solution {
    public static double addTenPercent(int i) {
        //Define variable to add
        double a = (i * .10);
        return (i + a);
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
