package com.codegym.task.task04.task0441;


/* 
Somehow average

*/

import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input1 = reader.readLine(), input2 = reader.readLine(), input3 = reader.readLine();
        int[] numarray = {Integer.parseInt(input1), Integer.parseInt(input2), Integer.parseInt(input3)};
        Arrays.sort(numarray);
        System.out.println(numarray[1]);

    }
}
