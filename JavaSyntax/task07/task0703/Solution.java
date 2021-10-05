package com.codegym.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Lonely arrays interact

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        int[] array2 = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = reader.readLine();
            array2[i] = array[i].length();
            System.out.println(array2[i]);
        }
    }

}
