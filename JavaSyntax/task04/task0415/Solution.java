package com.codegym.task.task04.task0415;

/* 
Rule of the triangle

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String side1 = reader.readLine();
        String side2 = reader.readLine();
        String side3 = reader.readLine();
        int s1 = Integer.parseInt(side1);
        int s2 = Integer.parseInt(side2);
        int s3 = Integer.parseInt(side3);
        if ((s1<(s2+s3)) && (s2<(s1+s3)) && (s3<(s1+s2))) {
            System.out.println("The triangle is possible.");
        }else{
            System.out.println("The triangle is not possible.");
        }
    }
}

