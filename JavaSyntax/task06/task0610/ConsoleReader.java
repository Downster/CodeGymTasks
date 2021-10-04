package com.codegym.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
ConsoleReader class

*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        return input;
    }

    public static int readInt() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        return input;
    }

    public static double readDouble() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double input = Double.parseDouble(reader.readLine());
        return input;
    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        String input = reader.readLine();
        return input.equals("true");

    }

    public static void main(String[] args) {

    }
}
