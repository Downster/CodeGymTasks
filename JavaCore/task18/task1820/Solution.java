package com.codegym.task.task18.task1820;

/* 
Rounding numbers

*/

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream = new FileOutputStream(reader.readLine());
        byte[] buffer = new byte[inputStream.available()];
        while (inputStream.available() > 0) {
            inputStream.read(buffer);
            outputStream.write(roundUp(buffer));
        }
        inputStream.close();
        outputStream.close();

    }
    public static byte[] roundUp(byte[] buffer) {
        String convert = new String(buffer, StandardCharsets.UTF_8);
        String [] strArr = convert.split(" ");
        int[] numbers = new int[strArr.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)((Math.round(Double.parseDouble(strArr[i]))));
        }
        String roundedNum = Arrays.toString(numbers).replace(",", "").replace("[", "").replace("]", "");
        byte[] bytes = roundedNum.getBytes(StandardCharsets.UTF_8);
        return bytes;
    }
}
