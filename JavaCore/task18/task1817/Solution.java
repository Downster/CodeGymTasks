package com.codegym.task.task18.task1817;

/* 
Spaces

*/

import java.io.FileInputStream;
import java.io.IOException;
import java.text.DecimalFormat;

public class Solution {

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        DecimalFormat df = new DecimalFormat("0.00");
        FileInputStream inputStream = new FileInputStream(fileName);
        int charCount = 0;
        int spaceCount = 0;
        while (inputStream.available() > 0) {
            char input = (char) inputStream.read();
            charCount++;
            if (input == ' ') {
                spaceCount++;
            }

        }
        inputStream.close();
        double ans = (spaceCount * 1.0)/(charCount * 1.0) * 100.0;
        System.out.println(df.format(ans));


    }
}
