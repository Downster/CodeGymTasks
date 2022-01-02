package com.codegym.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Threads and bytes

*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str;
        while (!(str = reader.readLine()).equals("exit")) {
            new ReadThread(str).start();
        }

    }

    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
        public void run(){
            byte[] byteCount = new byte[256];
            try {
                FileInputStream inputStream = new FileInputStream(fileName);
                while (inputStream.available() > 0) {
                    int aByte = inputStream.read();
                    byteCount[aByte]++;

                }
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            int maxCount = 0;
            int maxCountByte = 0;
            for (int i = 0; i < byteCount.length; i++) {
                if (byteCount[i] > maxCount) {
                    maxCount = byteCount[i];
                    maxCountByte = i;
                }
            }
            resultMap.put(fileName, maxCountByte);

        }
    }
}
