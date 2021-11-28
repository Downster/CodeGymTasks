package com.codegym.task.task16.task1617;

/* 
Countdown at the races

*/

public class Solution {
    public static volatile int numSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        clock.interrupt();
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            int start = numSeconds;
            try{
                while (!isInterrupted() && numSeconds >0){
                    System.out.println(numSeconds);
                    Thread.sleep(1000);
                    numSeconds--;
                }
            } catch (InterruptedException e) {
            }
            if (start <= 3.5){
                System.out.println("Go!");
            } else {
                System.out.println("Interrupted!");
            }
            }
        }
    }

