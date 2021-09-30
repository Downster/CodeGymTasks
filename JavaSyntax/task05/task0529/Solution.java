package com.codegym.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Console-based piggy bank

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;
        while (true) {
            String in = bufferedReader.readLine();
            if (in.equals("sum")) {
                System.out.println(total);
                break;
            } else {
                total = Integer.parseInt(in) + total;

            }
        }
    }
}
