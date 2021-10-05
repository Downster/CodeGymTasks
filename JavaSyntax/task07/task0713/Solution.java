package com.codegym.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Playing Javarella

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> main = new ArrayList<Integer>();
        ArrayList<Integer> divby3 = new ArrayList<Integer>();
        ArrayList<Integer> divby2 = new ArrayList<Integer>();
        ArrayList<Integer> other = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++ ) {
            main.add(Integer.parseInt(reader.readLine()));
        }
        for (Integer i: main) {
            if ((i % 3 == 0) && (i % 2 == 0)) {
                divby3.add(i);
                divby2.add(i);
            } else if (i % 3 == 0) {
                divby3.add(i);
            } else if (i % 2 == 0) {
                divby2.add(i);
            } else {
                other.add(i);
            }
        }
        printList(divby3);
        printList(divby2);
        printList(other);
    }

    public static void printList(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
