package com.codegym.task.task16.task1613;

/* 
Big Ben

*/

public class Solution {
    public static volatile boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Clock clock = new Clock("London", 23, 59, 57);
        Thread.sleep(4000);
        isStopped = true;
        Thread.sleep(1000);
    }

    public static class Clock extends Thread {
        private String cityName;
        private int hours;
        private int minutes;
        private int seconds;

        public Clock(String cityName, int hours, int minutes, int seconds) {
            this.cityName = cityName;
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
            start();
        }

        public void run() {
            try {
                while (!isStopped) {
                    printTime();
                }
            } catch (InterruptedException e) {
            }
        }

        private void printTime() throws InterruptedException {
            if (hours == 0 && minutes == 0 && seconds == 0) {
                System.out.println(String.format("It's currently midnight in %s!", cityName));
                seconds++;
            } else {
                System.out.println(String.format("In %s, the time is now %02d:%02d:%02d!", cityName, hours, minutes, seconds));
                if (seconds == 59) {
                    seconds = 0;
                    if (minutes == 59) {
                        minutes = 0;
                        if (hours == 23) {
                            hours = 0;
                        } else {
                            hours++;
                        }
                    } else {
                        minutes++;
                    }
                } else {
                    seconds++;
                }
            }
            Thread.sleep(1000);
        }
    }
}
