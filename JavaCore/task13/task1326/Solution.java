package com.codegym.task.task13.task1326;

/* 
Sorting even numbers from a file

*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(fileName));
        Scanner scanner = new Scanner(inputStream);
        ArrayList<Integer> list = new ArrayList<>();

        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            if (i % 2 == 0) {
                list.add(i);
            }
            }

        Collections.sort(list);
        for (Integer i : list){
            System.out.println(i);
        }
        scanner.close();
        inputStream.close();
    }
}
