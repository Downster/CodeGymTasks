package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String num1 = reader.readLine();
        String num2 = reader.readLine();

        System.out.println(name +" will receive " + num1 + " in " + num2 + " years.");
    }
}
