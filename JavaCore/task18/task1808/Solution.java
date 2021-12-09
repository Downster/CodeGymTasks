package com.codegym.task.task18.task1808;

/* 
Splitting a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());

        int halfOfFile = (inputStream.available() + 1) / 2;
        int byteCount = 0;

        while (inputStream.available() > 0) {
            if (byteCount < halfOfFile) {
                outputStream.write(inputStream.read());
                byteCount++;
            } else {
                outputStream1.write(inputStream.read());
            }
        }


        inputStream.close();
        outputStream1.close();
        outputStream.close();

    }
}
