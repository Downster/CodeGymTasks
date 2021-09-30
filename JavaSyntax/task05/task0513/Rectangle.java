package com.codegym.task.task05.task0513;

/* 
Let's put together a rectangle

*/

public class Rectangle {
    int left;
    int top;
    int width;
    int height;

    public void initialize (int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public void initialize (int left, int top) {
        this.left = left;
        this.top = top;
    }

    public void initialize (int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.width = width;
    }

    public void initialize (Rectangle rectangle) {
    }

    public static void main(String[] args) {

    }
}
