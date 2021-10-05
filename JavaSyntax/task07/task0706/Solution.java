package com.codegym.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Streets and houses

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[15];
        int even = 0;
        int odd = 0;
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
            if (i % 2 == 0) {
                even += list[i];
            } else {
                odd += list[i];
            }
        }
        if (even > odd) {
            System.out.println("Even-numbered houses have more residents.");
        } else {
            System.out.println("Odd-numbered houses have more residents.");
        }
    }
}
