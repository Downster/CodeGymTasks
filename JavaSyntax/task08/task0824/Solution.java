package com.codegym.task.task08.task0824;

/* 
Make a family

*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) {
        //children
        Human Sherry = new Human("Sherry", false, 23);
        Human Terry = new Human("Terry", true, 21);
        Human Merry = new Human("Merry", false, 18);

        //mother and father
        Human Darryl = new Human("Darryl", true, 55, Sherry, Terry, Merry);
        Human Sheryl = new Human("Sheryl", false, 53, Sherry, Terry, Merry);

        //grandparents
        Human Paul = new Human("Paul", true, 95, Darryl);
        Human Dan = new Human("Dan", true, 92, Sheryl);
        Human Ruth = new Human("Ruth", false, 87, Sheryl);
        Human Riley = new Human("Riley", false, 95, Darryl);

        System.out.println(Sherry);
        System.out.println(Terry);
        System.out.println(Merry);
        System.out.println(Darryl);
        System.out.println(Sheryl);
        System.out.println(Paul);
        System.out.println(Dan);
        System.out.println(Ruth);
        System.out.println(Riley);



    }

    public static class Human {
        String name;
        boolean sex;
        int age;

        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }


        public Human(String name, boolean sex, int age, Human... children) {
            this.name = name;
            this.sex = sex;
            this.age = age;

            Collections.addAll(this.children, children);
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", children: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
