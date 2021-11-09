package com.codegym.task.task13.task1319;

import java.io.*;

/* 
Writing to a file from the console

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileOutputStream outputStream = new FileOutputStream(fileName);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(outputStream));


        while (true){
            String lines = reader.readLine();
            if (lines.equals("exit")){
                writer.write(lines);
                writer.newLine();
                writer.close();
                outputStream.close();
                reader.close();
                break;
            } else {
                writer.write(lines);
                writer.newLine();
            }


        }
    }
}
