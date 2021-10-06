package com.codegym.task.task08.task0816;

import java.lang.reflect.Array;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Doggy", df.parse("JULY 23 1999"));
        map.put("Darryl", df.parse("SEPTEMBER 12 1979"));
        map.put("Deshawn", df.parse("AUGUST 16 1999"));
        map.put("Ripple", df.parse("DECEMBER 9 1991"));
        map.put("Connor", df.parse("JANUARY 13 1995"));
        map.put("Sambam", df.parse("MAY 14 1989"));
        map.put("Rabbletrow", df.parse("JUNE 24 1999"));
        map.put("Rockstar", df.parse("APRIL 11 1956"));
        map.put("Bernstein", df.parse("AUGUST 14 1945"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        ArrayList<String> months = new ArrayList<>(Arrays.asList("Jun", "Jul", "Aug"));
        HashMap<String, Date> dummy = new HashMap<>(map);
        for (Map.Entry<String, Date> entry : dummy.entrySet()) {
            for (String s : months) {
                if (entry.getValue().toString().contains(s)) {
                    map.remove(entry.getKey());
                }
            }
        }


    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> mappy = createMap();
        removeAllSummerPeople(mappy);


    }
}
