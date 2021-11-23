package com.codegym.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Request parser

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, String> objects = new HashMap<>();
        ArrayList<String> obj = new ArrayList<>();
        String input = reader.readLine();
        String str = createStringCharArray(input);
        String[] splString = str.split("&");
        for (String s : splString){
            if (s.contains("=") && !s.contains("obj")) {
                String[] values = s.split("=");
                obj.add(values[0]);
            } else if (s.contains("=") && s.contains("obj")){
                String[] values = s.split("=");
                obj.add(values[0]);
                objects.put(values[0], values[1]);
            } else {
                obj.add(s);
            }
        }
        System.out.println(buildString(obj));


        for (Map.Entry<String, String> mapElement : objects.entrySet()) {
            String value = mapElement.getValue();
            try {
                double dub = Double.parseDouble(value);
                alert(dub);
            } catch (Exception e) {
                alert(value);
            }
        }



    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }

    public static String createStringCharArray(String input) {
        StringBuilder str = new StringBuilder();
        str.append(input);
        str.delete(0, (input.indexOf('?') + 1));
        return str.toString();
    }

    public static String buildString(ArrayList<String> list){
        StringBuilder build = new StringBuilder();
        for (String s : list){
            build.append(s).append(" ");
        }
        String result = build.toString();
        return result.trim();
    }


}
