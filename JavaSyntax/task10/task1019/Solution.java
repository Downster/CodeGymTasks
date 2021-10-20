package com.codegym.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Functionality is not enough!

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> mappy = new HashMap<>();

        while (true) {
            try {
                int id = Integer.parseInt(reader.readLine());
                String name = reader.readLine();
                if (name.equals("")) {
                    mappy.put("", id);
                    break;
                }
                mappy.put(name, id);
            }
            catch (Exception e) {
                break;
            }
        }

        for (Map.Entry<String, Integer> pair : mappy.entrySet()) {
            String name = pair.getKey();
            int num = pair.getValue();
            System.out.println(num + " " + name);
        }
    }
}
