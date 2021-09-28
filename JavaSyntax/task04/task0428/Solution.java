package com.codegym.task.task04.task0428;

/* 
Positive number

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
        int count = 0;
        if (num1 > 0) {
            count ++;
        }
        if (num2 > 0) {
            count ++;
        }
        if (num3 > 0) {
            count ++;
        }
        System.out.println(count);

    }
}
