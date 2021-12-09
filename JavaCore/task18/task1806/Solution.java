package com.codegym.task.task18.task1806;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Fix the bugs

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream("c:/data.txt");
        // Create a stream to write bytes to a file
        FileOutputStream outputStream = new FileOutputStream("c:/result.txt");

        byte[] buffer = new byte[1000];

        if (inputStream.available() > 0) {
            // Read the entire file in one batch
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count);
        }

        inputStream.close();
        outputStream.close();
    }
}
