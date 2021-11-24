package com.codegym.task.task16.task1603;

import java.util.ArrayList;
import java.util.List;

/* 
A list and some threads

*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<>(5);

    public static void main(String[] args) {
        Thread thread1 = new Thread(new SpecialThread());
        Thread thread2 = new Thread(new SpecialThread());
        Thread thread3 = new Thread(new SpecialThread());
        Thread thread4 = new Thread(new SpecialThread());
        Thread thread5 = new Thread(new SpecialThread());
        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
        list.add(thread5);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("This is the run method inside SpecialThread");
        }
    }
}
