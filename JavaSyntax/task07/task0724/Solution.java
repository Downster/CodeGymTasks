package com.codegym.task.task07.task0724;

/* 
Family census

*/

public class Solution {
    public static void main(String[] args) {
        Human Kate = new Human("Kate", false, 12 );
        System.out.println(Kate);
        Human Dave = new Human("Dave", true, 25);
        System.out.println(Dave);
        Human Kane = new Human("Kane", false, 15);
        System.out.println(Kane);
        Human Dana = new Human("Dana", true, 13);
        System.out.println(Dana);
        Human Daddy = new Human("Daddy", true, 35, Dave, Dana);
        System.out.println(Daddy);
        Human Mommy = new Human("Mommy", false, 38, Kane, Kate);
        System.out.println(Mommy);
        Human Kiddo = new Human("Kiddo", true, 3, Daddy, Mommy);
        System.out.println(Kiddo);
        Human Kiddo2 = new Human("Kiddo2", true, 5, Daddy, Mommy);
        System.out.println(Kiddo2);
        Human Kiddo3 = new Human("Kiddo3", false, 3, Daddy, Mommy);
        System.out.println(Kiddo3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human (String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human (String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Name: " + this.name;
            text += ", sex: " + (this.sex ? "male" : "female");
            text += ", age: " + this.age;

            if (this.father != null) {
                text += ", father: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", mother: " + this.mother.name;
            }
            return text;
        }
    }
}