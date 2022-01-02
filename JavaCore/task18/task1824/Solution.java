package com.codegym.task.task18.task1824;

/* 
Files and exceptions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String input = reader.readLine();
            try {
                FileInputStream inputStream = new FileInputStream(input);
                inputStream.close();
            } catch (FileNotFoundException e) {
                System.out.println(input);
                break;
            }


        }
    }
}
