package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);
        int num3 = Integer.parseInt(number3);
        int poscount = 0;
        int negcount = 0;
        if (num1 > 0) {
            poscount ++;
        }
        if (num1 < 0) {
            negcount ++;
        }
        if (num2 > 0) {
            poscount ++;
        }
        if (num2 < 0) {
            negcount ++;
        }
        if (num3 > 0) {
            poscount ++;
        }
        if (num3 < 0) {
            negcount ++;
        }
        System.out.println("Number of negative numbers: " + negcount);
        System.out.println("Number of positive numbers: " + poscount);
    }
}
