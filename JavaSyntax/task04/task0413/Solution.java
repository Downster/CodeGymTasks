package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //Take input from keyboard
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Declare variable from input
        String number = reader.readLine();
        // Convert string to integert
        int f = Integer.parseInt(number);
        // Determine which day of the week it is and print the result
        if (f < 1 ) {
            System.out.println("No such day of the week");
        }
        if (f == 1) {
            System.out.println("Monday");
        }
        if (f == 2) {
            System.out.println("Tuesday");
        }
        if (f == 3) {
            System.out.println("Wednesday");
        }
        if (f == 4) {
            System.out.println("Thursday");
        }
        if (f == 5) {
            System.out.println("Friday");
        }
        if (f == 6) {
            System.out.println("Saturday");
        }
        if (f == 7) {
            System.out.println("Sunday");
        }
        if (f > 7 ) {
            System.out.println("No such day of the week");
        }
    }
}