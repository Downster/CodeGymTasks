package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine(), year = reader.readLine(), month = reader.readLine(), day = reader.readLine();
        int yr = Integer.parseInt(year), mth = Integer.parseInt(month), dy = Integer.parseInt(day);
        System.out.println("My name is " + name + ".");
        System.out.println("I was born on " + mth + "/" + dy + "/" + yr);
    }
}
