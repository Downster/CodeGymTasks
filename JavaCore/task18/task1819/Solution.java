package com.codegym.task.task18.task1819;

/* 
Combining files

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        String file2 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(file);


        byte[] bytes = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            int count = inputStream.read(bytes);
        }
        FileOutputStream outputStream = new FileOutputStream(file);
        FileInputStream inputStream1 = new FileInputStream(file2);

        while (inputStream1.available() > 0) {
            int input = inputStream1.read();
            outputStream.write(input);
        }
        outputStream = new FileOutputStream(file, true);
        outputStream.write(bytes);

        inputStream.close();
        inputStream1.close();
        outputStream.close();


    }
}
