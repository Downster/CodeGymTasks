package com.codegym.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;

/* 
Set of cats

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        for (Cat c : cats) {
            cats.remove(c);
            break;
        }
        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> cats = new HashSet<>();
        Cat dolly = new Cat();
        Cat trolly = new Cat();
        Cat molly = new Cat();
        cats.add(dolly);
        cats.add(trolly);
        cats.add(molly);
        return cats;
    }

    public static void printCats(Set<Cat> cats) {
        for (Cat c : cats) {
            System.out.println(c);
        }
    }

    public static class Cat {

    }
}
