package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> hambone = new ArrayList<String>();
        hambone.add("Sam");
        hambone.add("I");
        hambone.add("Am");
        for (int i = 1; i < hambone.size(); i += 2) {
            hambone.add(i, "Ham");
        }
        hambone.add(hambone.size(), "Ham");
        for (String i: hambone) {
            System.out.println(i);
        }
    }
}
