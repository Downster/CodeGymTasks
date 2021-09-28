package com.codegym.task.task04.task0436;


/* 
Drawing a rectangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num1 = reader.readLine(), num2 = reader.readLine();
        String text = "";
        int n = Integer.parseInt(num2);
        int m = Integer.parseInt(num1);
        for (int i = 0; i < n; i++) {
            text += 8;
            }
        for (int i = 0; i < m; i++) {
            System.out.println(text);
        }
        }

    }

