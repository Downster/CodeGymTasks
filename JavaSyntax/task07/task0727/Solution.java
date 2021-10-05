package com.codegym.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Changing functionality

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> newList = new ArrayList<String>();
        for (String s : list) {
            newList.add(s);
        }
        for (String s : newList) {
            if (s.length() % 2 == 0) {
                System.out.println(s + " " + s);
            } else {
                System.out.println(s + " " + s + " " + s);
            }

        }
    }
}

