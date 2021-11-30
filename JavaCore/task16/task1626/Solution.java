package com.codegym.task.task16.task1626;

public class Solution {
    public static int number = 5;

    public static void main(String[] args) {
        new Thread(new CountdownRunnable(), "Decrease").start();
        new Thread(new CountUpRunnable(), "Increase").start();
    }

    public static class CountUpRunnable implements Runnable{
        private int countUpIndex;

        @Override
        public String toString() {
            return Thread.currentThread().getName() + ": " + countUpIndex;
        }

        public void run() {
            try {
                while (true) {
                    countUpIndex++;
                    System.out.println(toString());
                    Thread.sleep(500);
                    if (countUpIndex == number) return;
                }
            }catch (InterruptedException e) {
            }
        }
    }


    public static class CountdownRunnable implements Runnable {
        private int countdownIndex = Solution.number;

        public void run() {
            try {
                while (true) {
                    System.out.println(toString());
                    countdownIndex -= 1;
                    if (countdownIndex == 0) return;
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }

        public String toString() {
            return Thread.currentThread().getName() + ": " + countdownIndex;
        }
    }
}
