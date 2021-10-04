package com.codegym.task.task06.task0609;
import java.math.*;
/* 
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        int x = (x2 - x1), y = (y2 - y1);
        double xsq = Math.pow(x, 2), ysq = Math.pow(y, 2);
        double ans = xsq + ysq;
        return Math.sqrt(ans);


    }

    public static void main(String[] args) {

    }
}
