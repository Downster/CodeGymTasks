package com.codegym.task.task04.task0432;



/* 
You can't have too much of a good thing

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String number = reader.readLine();
        int num = Integer.parseInt(number);
        while (num > 0) {
            System.out.println(s);
            num --;
        }

    }
}
