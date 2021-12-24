package com.codegym.task.task18.task1818;

/* 
Two in one

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream outputStream = new FileOutputStream(reader.readLine(), true);
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileInputStream inputStream1 = new FileInputStream(reader.readLine());
        while (inputStream.available() > 0){
            int input = inputStream.read();
            outputStream.write(input);
        }

        while (inputStream1.available() > 0) {
            int input = inputStream1.read();
            outputStream.write(input);
            }
        outputStream.close();
        inputStream.close();
        inputStream1.close();
        }

    }
