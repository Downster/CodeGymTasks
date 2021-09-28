package com.codegym.task.task04.task0409;

/* 
Closest to 10

*/

public class Solution {
    public static void main(String[] args) {
        displayClosestToTen(8, 11);
        displayClosestToTen(7, 14);
    }

    public static void displayClosestToTen(int a, int b) {
        int first = 10 - a;
        int second = 10 - b;
        if (abs(first) > abs(second)) {
            System.out.println(b);
        }
        if (abs(first) < abs(second)) {
            System.out.println(a);
        }
        if (abs(first) == abs(second)) {
            System.out.println(b);
        }

    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}