package com.codegym.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
One large array and two small ones

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] list = new int[20], list2 = new int[10], list3 = new int[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(reader.readLine());
            }
        for (int j = 0; j < 10; j++) {
            list2[j] = list[j];
            list3[j] = list[j + 10];
            System.out.println(list3[j]);
        }
        }


    }
