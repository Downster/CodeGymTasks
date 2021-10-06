package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Downing", 2000000);
        map.put("Brodley", 20000000);
        map.put("Latino", 2000000000);
        map.put("Bobby", 300000000);
        map.put("Starr", 400);
        map.put("Baldino", 5000);
        map.put("Brambles", 200);
        map.put("Pleeb", 100);
        map.put("Trash", 5);
        map.put("Trump", 499);
        return map;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        HashMap<String, Integer> dummy = new HashMap<>(map);
        for (Map.Entry<String, Integer> entry : dummy.entrySet()) {
            if (entry.getValue() < 500) {
                map.remove(entry.getKey());
            }
        }

    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = createMap();
        removeItemFromMap(map);

    }
}