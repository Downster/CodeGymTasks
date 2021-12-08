package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        int maxByte = 0;
        while (inputStream.available() > 0) {
            int currentByte = inputStream.read();
            if (currentByte > maxByte){
                maxByte = currentByte;
            }
        }
        reader.close();
        inputStream.close();
        System.out.println(maxByte);
    }
}
