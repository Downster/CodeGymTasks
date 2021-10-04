package com.codegym.task.task06.task0617;

/* 
Notepad for new ideas

*/

import java.util.Objects;

public class Solution {
    public static void printIdea(Idea idea) {
        System.out.println(idea.getDescription());
    }

    public static class Idea {
        String description = "dong";

        public String getDescription() {
            return description;
        }

        public static void main(String[] args) {
            printIdea(new Idea());
        }


    }
}

