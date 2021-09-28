package com.codegym.task.task04.task0417;

/* 
Do we have a pair?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String input2 = reader.readLine();
        String input3 = reader.readLine();
        int in = Integer.parseInt(input);
        int in2 = Integer.parseInt(input2);
        int in3 = Integer.parseInt(input3);
        if ((in == in2) && (in2 == in3)) {
            System.out.println(in + " " + in2 + " " + in3);
        } else {
            if (in == in2) {
                System.out.println(in + " " + in2);
            }
            if (in2 == in3) {
                System.out.println(in2 + " " + in3);
            }
            if (in == in3) {
                System.out.println(in + " " + in3);
            }

        }
    }
}