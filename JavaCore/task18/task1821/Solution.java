package com.codegym.task.task18.task1821;

/* 
Symbol frequency

*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<Integer, Integer> ASCIIcount = initASCIIMap();
        FileInputStream inputStream = new FileInputStream(args[0]);
        while (inputStream.available() > 0) {
            int input = inputStream.read();
            int count = ASCIIcount.get(input);
            if (ASCIIcount.containsKey(input)) {
                ASCIIcount.put(input, count + 1);
            }
        }
        for( Map.Entry<Integer, Integer> entry : ASCIIcount.entrySet() ){
            int entry1 = entry.getKey();
            char c = (char) entry1;
            if (entry.getValue() > 0) {
                System.out.println(c + " " + entry.getValue());
            }
        }
        inputStream.close();


    }

    public static int[] initASCIIArray(){
        int[] intArray = new int[128];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }
        return intArray;
    }

    public static HashMap<Integer, Integer> initASCIIMap() {
        int[] ascii = initASCIIArray();
        HashMap<Integer, Integer> asciiMap = new HashMap<>();
        for (int i : ascii) {
            asciiMap.put(i, 0);
        }
        return asciiMap;
    }
}
