package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int least = 255;
        while (inputStream.available() > 0) {
            int input = inputStream.read();
            if (input < least) {
                least = input;
            }
        }
        inputStream.close();
        System.out.println(least);

        }
    }

