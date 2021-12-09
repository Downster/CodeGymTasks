package com.codegym.task.task18.task1805;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Sorting bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Set<Integer> set = new TreeSet<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        while (inputStream.available() > 0) {
            int num = inputStream.read();
            set.add(num);
        }
        inputStream.close();
        for (Integer i : set) {
            System.out.print(i + " ");
        }
    }
}
