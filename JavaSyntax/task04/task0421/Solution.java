package com.codegym.task.task04.task0421;

/* 
Jen or Jen?

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name1 = reader.readLine();
        String name2 = reader.readLine();
        int length1 = name1.length();
        int length2 = name2.length();
        if (name1.equals(name2)) {
            System.out.println("The names are identical");
        } else {
            if (length1 == length2) {
                System.out.println("The names are the same length");
            }
        }
    }
}
