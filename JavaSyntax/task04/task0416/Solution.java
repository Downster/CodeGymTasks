package com.codegym.task.task04.task0416;

/* 
Crossing the road blindly

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        double in = Double.parseDouble(input);
        // Every three minutes the light is green
        if ((in % 5) < 3) {
            System.out.println("green");
        }
        //Every three - four minutes the light is yellow
        if ((in % 5) >= 3 && (in % 5) < 4 ) {
            System.out.println("yellow");
        }
        //Every four - five minutes the lig
        if ((in % 5) >= 4) {
            System.out.println("red");
        }
    }
}