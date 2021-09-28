package com.codegym.task.task04.task0442;


/* 
Adding

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            String input = reader.readLine();
            int num = Integer.parseInt(input);
            if (num == -1) {
                sum += num;
                System.out.println(sum);
                break;
            } else {
                sum += num;
            }
    }
}
}
