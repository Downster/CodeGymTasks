package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<String>();
        ArrayList<String> largest = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        String large = strings.get(0);
        largest.add(strings.get(0));
        for (int i = 1 ; i < strings.size(); i++ ) {
            if (strings.get(i).length() == large.length()) {
                largest.add(strings.get(i));
                large = strings.get(i);
            } else if (strings.get(i).length() > large.length()) {
                largest.clear();
                largest.add(strings.get(i));
                large = strings.get(i);
            }


        }
        for (String k :largest) {
            System.out.println(k);
        }
    }
}

