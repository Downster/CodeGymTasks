package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> catMap = new HashMap<>();
        catMap.put("Fuzzy", new Cat("Fuzzy"));
        catMap.put("Ruzzy", new Cat("Ruzzy"));
        catMap.put("Fluffy", new Cat("Fluffy"));
        catMap.put("Rluffy", new Cat("Rluffy"));
        catMap.put("Tluffy", new Cat("Tluffy"));
        catMap.put("Sluffy", new Cat("Sluffy"));
        catMap.put("Kluffy", new Cat("Kluffy"));
        catMap.put("Gluffy", new Cat("Gluffy"));
        catMap.put("Xluffy", new Cat("Xluffy"));
        catMap.put("Zluffy", new Cat("Zluffy"));
        return catMap;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        HashSet<Cat> catSet = new HashSet<>(map.values());
        return catSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
