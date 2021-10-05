package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        ArrayList<String> smallest = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            list.add(reader.readLine());
        }
        String small = list.get(0);
        smallest.add(list.get(0));
        for (int i = 1 ; i < list.size(); i++ ) {
            if (list.get(i).length() == small.length()) {
                smallest.add(list.get(i));
                small = list.get(i);
            } else if (list.get(i).length() < small.length()) {
                smallest.clear();
                smallest.add(list.get(i));
                small = list.get(i);
            }


        }
        for (String k :smallest) {
            System.out.println(k);
        }
    }
}
