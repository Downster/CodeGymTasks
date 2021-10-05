package com.codegym.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Min and max in arrays

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        maximum = array[0];
        for (int j = 0; j < 20; j++) {
            if (array[j] > maximum) {
                maximum = array[j];
            }
        }
        minimum = array[0];
        for (int k = 0; k < 20; k++) {
            if (array[k] < minimum) {
                minimum = array[k];
            }
        }

        System.out.print(maximum + " " + minimum);
    }
}
