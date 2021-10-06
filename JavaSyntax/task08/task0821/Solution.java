package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Downing", "Brendan");
        map.put("Downing", "Connor");
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

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
