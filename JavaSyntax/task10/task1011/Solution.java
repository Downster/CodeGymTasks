package com.codegym.task.task10.task1011;

/* 
Big salary

*/

public class Solution {
    public static void main(String[] args) {
        String s = "I do not want to learn Java. I want a big salary";
        String newString;
        for (int i = 0; i < 43; i++) {
            newString = s.substring(i, s.length());
            System.out.println(newString);
        }


    }

}

