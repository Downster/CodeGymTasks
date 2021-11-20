package com.codegym.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Static modifiers: part 1

*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<>();

    static {
        labels.put(2.0, "poop");
        labels.put(3.0, "dookie");
        labels.put(4.0, "dong");
        labels.put(5.0, "slong");
        labels.put(6.0, "wrong");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
