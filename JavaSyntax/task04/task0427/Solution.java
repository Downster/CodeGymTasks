package com.codegym.task.task04.task0427;

/* 
Describing numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int num = Integer.parseInt(number);
        int length = number.length();
        if ((num % 2 ==0) && (length == 1) && (num != 0)) {
            System.out.println("even single-digit number");
        } else {
            if ((num % 2 ==0) && (length ==2) && (num != 0)) {
                System.out.println("even two-digit number");
            } else {
                if ((num % 2 ==0) && (length == 3) && num != 0) {
                    System.out.println("even three-digit number");
                }
            }
        }
        if ((num % 2 != 0) && (length ==1) && (num >= 0)) {
            System.out.println("odd single-digit number");
        } else {
            if ((num % 2 != 0) && (length == 2) && (num >= 0)) {
                System.out.println("odd two-digit number");
            } else {
                if ((num % 2 != 0) && (length ==3 ) && (num >= 0)) {
                    System.out.println("odd three-digit number");
                }
            }
        }
        if ((num < 1) || (num >999) || (num == 0)) {

        }


    }
}
