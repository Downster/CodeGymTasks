package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;

/* 
Longest sequence

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        int count = 1;
        int max = 1;
        while (list.size() < 10) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        for (int i = 0; i < 9; i++ ) {
            if (Objects.equals(list.get(i), list.get(i + 1))) {
                count += 1;
                if (count > max) {
                    max = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(max);

    }
}
