package com.codegym.task.task08.task0817;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Downing", "Brendan");
        map.put("Down", "Connor");
        map.put("Downer", "Brendan");
        map.put("Brodley", "Samantha");
        map.put("Bravo", "Samantha");
        map.put("Latino", "Joe");
        map.put("Strafe", "Ryan");
        map.put("Booth", "Josh");
        map.put("Gobright", "Brad");
        map.put("Handhold", "Alex");
        return map;

    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        HashMap<String, String> dummy = new HashMap<>(map);
        for (String s : dummy.values()) {
            int count = 0;
            for (String x : dummy.values()) {
                if (s.equals(x)) {
                    count += 1;
                }

            }
            if (count > 1) {
                removeItemFromMapByValue(map, s);
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> mappy = createMap();
        removeFirstNameDuplicates(mappy);

    }
}
