package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int M = Integer.parseInt(reader.readLine());
        ArrayList <String> list = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            list.add(reader.readLine());
        }
        for (int j = 0; j < M; j++) {
            list.add((list.size()), list.get(j));
        }
        for (int k = (M - 1); k >= 0; k--) {
            list.remove(k);
        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
