package com.codegym.task.task10.task1013;

/* 
Human class constructors

*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private int age;
        private int weight;
        private String address;
        private boolean sex;
        private String education;
        private boolean college;

        public Human(int age, int weight){
            this.age = age;
            this.weight = weight;
        }

        public Human(int age, int weight, boolean sex) {
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(int age, int weight, String address) {
            this.age = age;
            this.weight = weight;
            this.address = address;
        }

        public Human(int age, int weight, String address, boolean sex) {
            this.age = age;
            this.weight = weight;
            this.address = address;
            this.sex = sex;
        }

        public Human(int age, int weight, boolean sex, boolean college) {
            this.age = age;
            this.weight = weight;
            this.sex = sex;
            this.college = college;
        }

        public Human(int age, boolean sex, boolean college) {
            this.age = age;
            this.sex = sex;
            this.college = college;
        }

        public Human(boolean sex, boolean college){
            this.sex = sex;
            this.college = college;
        }

        public Human(int age, int weight, String address, String education) {
            this.age = age;
            this.weight = weight;
            this.address = address;
            this.education = education;
        }

        public Human(int age, int weight, String address, String education, boolean college) {
            this.age = age;
            this.weight = weight;
            this.address = address;
            this.education = education;
            this.college = college;
        }

        public Human(int age, int weight, String address, String education, boolean college, boolean sex) {
            this.age = age;
            this.weight = weight;
            this.address = address;
            this.education = education;
            this.college = college;
            this.sex = sex;
        }
    }
}
