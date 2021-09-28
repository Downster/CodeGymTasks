package com.codegym.task.task04.task0424;

/* 
Three numbers

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
        if (num1 == num2) {
            System.out.println("3");
        } else {
            if (num2 == num3){
                System.out.println("1");
            } else {
                if (num1 == num3) {
                System.out.println("2");
            }
        }
    }
}
}
