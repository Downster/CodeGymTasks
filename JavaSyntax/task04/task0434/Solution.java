package com.codegym.task.task04.task0434;


/* 
Multiplication table

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int number = 1;
        int count = 1;
        while (count < 11){
            System.out.print(number * count + " ");
            number ++;
            if (number == 11) {
                number = 1;
                count++;
                System.out.println();
            }
        }

    }
}
