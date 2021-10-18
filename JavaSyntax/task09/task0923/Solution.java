package com.codegym.task.task09.task0923;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Vowels and consonants

*/

public class Solution {
    public static char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        char [] ch = input.toCharArray();
        ArrayList<Character> vowelList = new ArrayList<>();
        ArrayList<Character> conList = new ArrayList<>();
        for (char c : ch) {
            if (isVowel(c)) {
                vowelList.add(c);
            } else {
                if (c != ' '){
                    conList.add(c);
                }

            }
        }
        for (char d : vowelList) {
            System.out.print(d + " ");
        }
        System.out.println();
        for (char p : conList) {
            System.out.print(p + " ");
        }
    }

    // The method checks whether a letter is a vowel
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Convert to lowercase

        for (char d : vowels)   // Look for vowels in the array
        {
            if (c == d) {
                return true;
            }
        }
        return false;
    }
}