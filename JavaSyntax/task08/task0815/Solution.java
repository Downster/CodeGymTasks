package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Radley", "Samantha");
        map.put("Downing", "Brendan");
        map.put("Latino", "Joe");
        map.put("Degroot", "Ethan");
        map.put("Downey", "Connor");
        map.put("Browning", "Brendan");
        map.put("Brodley", "Samantha");
        map.put("Bladsen", "Sarah");
        map.put("Small", "Sarah");
        map.put("Purlee", "Sarah");
        return map;
    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        int count = 0;
        for (String names: map.values()) {
            if (names.equals(name)) {
                count += 1;
            }
        }
        return count;

    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        int count = 0;
        for (String lastNames : map.keySet()) {
            if (lastNames.equals(lastName)) {
                count += 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HashMap<String, String> mappy = createMap();
        getSameFirstNameCount(mappy, "Samantha");
        getSameLastNameCount(mappy, "Downing");
    }
}
