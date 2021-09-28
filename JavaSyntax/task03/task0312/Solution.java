package com.codegym.task.task03.task0312;

/* 
Time conversion

*/

public class Solution {
    int hour;

    public static void main(String[] args) {
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(2));
    }

    public static int convertToSeconds(int hour) {
        return (hour * 60 * 60);
    }
}
