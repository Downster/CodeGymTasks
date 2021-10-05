package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (;;) {
            String S = reader.readLine();
            list.add(S);
            if (S.equals("end")) {
                list.remove(list.size()-1);
                break;
            }
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}