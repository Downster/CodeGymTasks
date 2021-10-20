package com.codegym.task.task10.task1015;

import java.util.ArrayList;
import java.util.Arrays;

/* 
Array of string lists

*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        ArrayList<String>[] arrayStr = new ArrayList[3];
        arrayStr[0] = new ArrayList<String>(Arrays.asList("poop", "sloop"));
        arrayStr[1] = new ArrayList<String>(Arrays.asList("this", "is", "dumb"));
        arrayStr[2] = new ArrayList<String>(Arrays.asList("lol", "why"));

        return arrayStr;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}