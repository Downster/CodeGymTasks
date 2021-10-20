package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        HashMap<Character, Integer> numCount = new HashMap<>();
        for (char c : alphabet) {
            numCount.put(c, 0);
        }
        ArrayList<Character> charList = new ArrayList<>();
        for (String s : list) {
            char[] array = s.toCharArray();
            for (char c : array) {
                charList.add(c);
            }
        }
        for (char c : charList) {
            numCount.computeIfPresent(c, (k, v) -> v + 1);
        }

        for (Map.Entry<Character, Integer> entry : numCount.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
