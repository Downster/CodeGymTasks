package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.FieldPosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer stringBuffer = new StringBuffer();
        HashMap<String, String> months = createMap();
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        Date date = simpleDateFormat.parse(reader.readLine());
        StringBuffer dates = simpleDateFormat.format(date, stringBuffer, new FieldPosition(0));
        String month = dates.substring(5,7);
        String day = dates.substring(8,10);
        String year = dates.substring(0,4);
        String output = compare(month, months);
        System.out.println(output + " " + day + ", " + year);


    }
    public static HashMap<String, String> createMap() {
        HashMap<String, String> months = new HashMap<>();
        months.put("01", "JAN");
        months.put("02", "FEB");
        months.put("03", "MAR");
        months.put("04", "APR");
        months.put("05", "MAY");
        months.put("06", "JUN");
        months.put("07", "JUL");
        months.put("08", "AUG");
        months.put("09", "SEP");
        months.put("10", "OCT");
        months.put("11", "NOV");
        months.put("12", "DEC");
        return months;
    }

    public static String compare(String month, HashMap<String, String> months) {
        String out = "";
        if (months.containsKey(month)) {
            out = months.get(month);
        }
        return out;
    }
}
