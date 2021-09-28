package com.codegym.task.task04.task0426;

/* 
Labels and numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        int num1 = Integer.parseInt(number1);
        if ((num1 < 0) && (num1 % 2 == 0)) {
            System.out.println("Negative even number");
        }
        if ((num1 < 0) && (num1 % 2 != 0)) {
            System.out.println("Negative odd number");
        }
        if (num1 == 0) {
            System.out.println("Zero");
        }
        if ((num1 > 0) && (num1 % 2 == 0)) {
            System.out.println("Positive even number");
        }
        if ((num1 > 0) && (num1 % 2 != 0)) {
            System.out.println("Positive odd number");
        }
    }
}
