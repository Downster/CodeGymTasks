package com.codegym.task.task04.task0420;

/* 
Sorting three numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        int num = Integer.parseInt(number);
        int num2 = Integer.parseInt(number1);
        int num3 = Integer.parseInt(number2);
        if ((num > num2) && (num3 > num)) {
            System.out.println(num3 + " " + num + " " + num2);
        }
        if ((num < num2) && (num3 > num2)) {
            System.out.println(num3 + " " + num2 + " " + num);
        }
        if ((num < num2) && (num3 < num2) && (num3 > num)) {
            System.out.println(num2 + " " + num3 + " " + num);
        }
        if ((num < num2) && (num3 < num)) {
            System.out.println(num2 + " " + num + " " + num3);
        }
        if ((num > num2) && (num2 > num3)) {
            System.out.println(num + " " + num2 + " " + num3);
        }
        if ((num > num3) && (num3 > num2)) {
            System.out.println(num + " " + num3 + " " + num2);
        }
        if ((num == num2) && (num3 > num2)) {
            System.out.println(num3 + " " + num2 + " " + num);
        }
        if ((num3 == num2) && (num > num2)) {
            System.out.println(num + " " + num2 + " " + num3);
        }
        if ((num3 == num) && (num2 > num)) {
            System.out.println(num2 + " " + num3 + " " + num);
        }
        if ((num3 == num) && (num3 > num2)) {
            System.out.println(num3 + " " + num + " " + num2);
        }
        if ((num2 == num3) && (num2 > num)) {
            System.out.println(num3 + " " + num2 + " " + num);
        }
        if ((num == num2) && (num > num3)) {
            System.out.println(num + " " + num2 + " " + num3);
        }
    }
}
