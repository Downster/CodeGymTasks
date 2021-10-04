package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[5];
        for (int i = 0; i < (list.length); i++) {
            list[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(list);
        for (int i = 0; i < (list.length); i++) {
            System.out.println(list[i]);
        }


    }
}
