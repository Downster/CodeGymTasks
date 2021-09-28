package com.codegym.task.task04.task0414;

/* 
Number of days in the year

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String year = reader.readLine();
        int yr = Integer.parseInt(year);
        int leap = 366;
        int reg = 365;
        if (yr % 400 == 0) {
            System.out.println("Number of days in the year: " + leap);
        } else {
            if (yr % 100 == 0) {
                System.out.println("Number of days in the year: " + reg);
            } else {
                if (yr % 4 == 0) {
                    System.out.println("Number of days in the year: " + leap);
                } else {
                    System.out.println("Number of days in the year: " + reg);
                }
            }
        }
    }
}