package com.codegym.task.task04.task0438;

/* 
Drawing lines

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int count = 10;
        String text = "8";
        String vert = "8";
        for (int i = 1; i < count; i++) {
            text += "8";
        }
        System.out.print(text);
        for (int i = 0; i < count; i++) {
            System.out.println(vert);
        }

    }
}
