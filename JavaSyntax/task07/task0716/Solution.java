package com.codegym.task.task07.task0716;

import java.util.ArrayList;

/* 
R or L

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        list.add("rose"); // 0
        list.add("lyre"); // 1
        list.add("love"); // 2
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            char[] chars = list.get(i).toCharArray();
            boolean contr = false;
            boolean contl = false;
            for (Character c : chars) {
                if (c.equals('r')) {
                    contr = true;
                } else if (c.equals('l')) {
                    contl = true;
                }
            }
            if (contr && !contl) {
                list.remove(i);
            } else if (contl && !contr) {
                list.add(list.get(i));
            }
        }
        return list;
    }
}