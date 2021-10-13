package com.codegym.task.task09.task0906;

/* 
Logging stack traces

*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTraceElements[2];
        String className = element.getClassName();
        String methodName = element.getMethodName();
        String message = className + ": " + methodName + ": " + s;
        System.out.println(message);
    }
}
