package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }
        String small = list.get(0);
        int index1 = 0;
        for (int i = 1 ; i < list.size(); i++ ) {
            if (list.get(i).length() < small.length()) {
                small = list.get(i);
                index1 = i;

            }


        }
        String large = list.get(0);
        int index2 = 0;
        for (int i = 1 ; i < list.size(); i++ ) {
            if (list.get(i).length() > large.length()) {
                large = list.get(i);
                index2 = i;

            }
        }
        if (index1 < index2) {
            System.out.println(small);
        } else {
            System.out.println(large);
        }
        }
    }
