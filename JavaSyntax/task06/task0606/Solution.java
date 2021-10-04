package com.codegym.task.task06.task0606;

import java.io.*;
import java.util.Arrays;

/* 
Even and odd digits

*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        String[] split = input.split("");
        for (String s : split) {
            int num = Integer.parseInt(s);
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Even: " + even + " Odd: " + odd);

    }
}
