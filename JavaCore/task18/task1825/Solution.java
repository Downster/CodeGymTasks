package com.codegym.task.task18.task1825;

import java.io.*;
import java.util.*;

/* 
Building a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> fileNames = new ArrayList<>();
        String input;
        ;
        while (!(input = reader.readLine()).equals("end")) {
            fileNames.add(input);
        }
        sortList(fileNames);
        int index = fileNames.get(0).lastIndexOf("part");
        String outputFile = fileNames.get(0).substring(0, index -1);
        FileOutputStream outputStream = new FileOutputStream(outputFile, true);
        for (String s : fileNames) {
            FileInputStream fileReader = new FileInputStream(s);
            byte[] buffer = new byte[fileReader.available()];
            while (fileReader.available() > 0) {
                fileReader.read(buffer);
                outputStream.write(buffer);
            }
            fileReader.close();


        }
        outputStream.close();

    }

        public static void sortList (ArrayList<String> list) {
            Collections.sort(list, new Comparator<String>() {
                public int compare(String o1, String o2) {
                    return extractInt(o1) - extractInt(o2);
                }

                int extractInt(String s) {
                    String num = s.replaceAll("\\D", "");
                    // return 0 if no digits found
                    return num.isEmpty() ? 0 : Integer.parseInt(num);
                }
            });
        }
    }


