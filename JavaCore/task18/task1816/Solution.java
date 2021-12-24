package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        int count = 0;
        FileInputStream inputStream = new FileInputStream(fileName);
        byte[] buffer = new byte[inputStream.available()];
        inputStream.read(buffer);
        String input = new String(buffer, StandardCharsets.UTF_8);
        input = input.toLowerCase();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (Character.isLetter(c)){
                count++;
            }

        }
        System.out.println(count);
        inputStream.close();
    }
}
