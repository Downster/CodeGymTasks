package com.codegym.task.task04.task0418;

/* 
Minimum of two numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String input2 = reader.readLine();
        int in = Integer.parseInt(input);
        int in2 = Integer.parseInt(input2);
        if (in < in2 ) {
            System.out.println(in);
        } else {
            if (in > in2) {
                System.out.println(in2);
            } else {
                System.out.println(in);
            }
        }

    }
}