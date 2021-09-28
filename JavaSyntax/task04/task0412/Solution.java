package com.codegym.task.task04.task0412;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int f = Integer.parseInt(number);
        if (f > 0) {
            f = f * 2;
            System.out.println(f);
        }
        if (f == 0) {
            System.out.println(f);
        }
        if (f < 0) {
            f = f + 1;
            System.out.println(f);
        }

    }

}