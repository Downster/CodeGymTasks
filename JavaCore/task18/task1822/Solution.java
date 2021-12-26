package com.codegym.task.task18.task1822;

/* 
Finding data inside a file

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader bufferedFileReader = new BufferedReader(new FileReader(reader.readLine()));
        String str;
        while ((str = bufferedFileReader.readLine()) != null) {
            if (str.startsWith(args[0] + " ")) {
                System.out.println(str);
                break;
            }
        }
        bufferedFileReader.close();

    }
}
