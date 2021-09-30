package com.codegym.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Improving functionality

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine()), b = Integer.parseInt(reader.readLine()), c = Integer.parseInt(reader.readLine()), d = Integer.parseInt(reader.readLine()), e = Integer.parseInt(reader.readLine());

        int minimum = min(a, b, c, d, e);
        System.out.println("Minimum = " + minimum);
    }


    public static int min(int a, int b, int c, int d, int e) {
        int min1 = Math.min(a, b);
        int min2 = Math.min(min1, c);
        int min3 = Math.min(min2, d);
        int min4 = Math.min(min3, e);
        return min4;
    }
}
