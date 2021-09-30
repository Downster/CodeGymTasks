package com.codegym.task.task05.task0528;

/* 
Display today's date

*/

public class Solution {
        String date;

        public Solution(String date) {
            this.date = date;
        }
    public static void main(String[] args) {
            Solution solution = new Solution("8 21 2021");
            System.out.println(solution.date);
    }
}
