package com.codegym.task.task04.task0419;

/* 
Maximum of four numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String input2 = reader.readLine();
        String input3 = reader.readLine();
        String input4 = reader.readLine();
        int in = Integer.parseInt(input);
        int in2 = Integer.parseInt(input2);
        int in3 = Integer.parseInt(input3);
        int in4 = Integer.parseInt(input4);
        int max1 = Math.max(in, in2);
        int max2 = Math.max(in3, in4);
        if (max1 > max2) {
            System.out.println(max1);
        } else {
            System.out.println(max2);
        }
    }
}
