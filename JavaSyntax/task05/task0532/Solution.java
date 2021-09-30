package com.codegym.task.task05.task0532;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Task about algorithms

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        if (maximum > 0) {
            List<Integer> list = new ArrayList();
            for (int i = 0; i < maximum; i++) {
                int in = Integer.parseInt(reader.readLine());
                list.add(in);
            }
            System.out.println(Collections.max(list));
        }
    }

    }

