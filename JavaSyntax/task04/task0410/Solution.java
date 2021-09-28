package com.codegym.task.task04.task0410;

/* 
Come on, lucky seven!

*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int a) {
        if (a < 50) {
            System.out.println("The number " + a + " is not in the interval.");
        }
        if (a > 100) {
            System.out.println("The number " + a + " is not in the interval.");
        }
        if (a > 50) {
            if (a < 100) {
                System.out.println("The number " + a + " is in the interval.");
            }
        }

    }
}