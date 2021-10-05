package com.codegym.task.task07.task0707;

import java.util.ArrayList;

/* 
What sort of list is that?

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        String s0 = "frustration";
        String s1 = "pent up";
        String s2 = "dope partner";
        String s3 = "not as advertised";
        String s4 = "my bad";
        list.add(s0);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
