package com.codegym.task.task16.task1620;

import java.util.ArrayList;
import java.util.List;

/* 
One for all, all for one

*/

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterrupt();
    }

    public static void ourInterrupt() {
        for (Thread t : threads) {
            t.interrupt();

        }
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));

        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;
        public static boolean isCurrentThreadInterrupted = false;

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            String threadName = Thread.currentThread().getName();
            if (Thread.currentThread().isInterrupted()) {
                isCurrentThreadInterrupted = true;
            }

            try {
                while (!isCurrentThreadInterrupted) {

                    System.out.println("Object " + sharedResource + ", thread " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
            }
        }
    }
}
