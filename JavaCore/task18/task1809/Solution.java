package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader2.readLine());

        List<Integer> byteList = new ArrayList<Integer>();
        while (inputStream.available() > 0) {
            byteList.add(inputStream.read());
        }

        for (int i = byteList.size()-1; i >= 0; i--) {
            outputStream.write(byteList.get(i));
        }

        inputStream.close();
        outputStream.close();


    }
}
