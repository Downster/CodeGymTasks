package com.codegym.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Different methods for different types

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String input = reader.readLine();
            try {
                if (input.contains(".")) {
                    Double dub = Double.parseDouble(input);
                    print(dub);
                } else if (Integer.parseInt(input) > 0 && Integer.parseInt(input) < 128) {
                    short shor = (short) Integer.parseInt(input);
                    print(shor);
                } else if (Integer.parseInt(input) <= 0 || Integer.parseInt(input) >= 128) {
                    Integer inte = Integer.parseInt(input);
                    print(inte);
                }
            } catch (Exception e) {
                if (input.equals("exit")) {
                    break;
                } else {
                    print(input);
                }

            }
        }
    }

        public static void print (Double value){
            System.out.println("This is a Double. Value: " + value);
        }

        public static void print (String value){
            System.out.println("This is a String. Value: " + value);
        }

        public static void print ( short value){
            System.out.println("This is a short. Value: " + value);
        }

        public static void print (Integer value){
            System.out.println("This is an Integer. Value: " + value);
        }
    }

