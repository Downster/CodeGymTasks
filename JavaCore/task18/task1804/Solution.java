package com.codegym.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Rarest bytes

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> store = new HashMap<>();
        ArrayList<Integer> keyStore = new ArrayList<>();
        while (inputStream.available() > 0) {
            int input = inputStream.read();
            if (store.containsKey(input)){
                int freq = store.get(input);
                freq++;
                store.put(input, freq);
            } else {
                store.put(input, 1);
            }
        }
        reader.close();
        inputStream.close();
        for (Map.Entry<Integer, Integer> entry : store.entrySet()) {
            if (entry.getValue().equals(1)) {
                keyStore.add(entry.getKey());
            }
        }
        System.out.println(keyStore.toString().replace("[","").replace("]","").replace(",", " "));

    }
}

