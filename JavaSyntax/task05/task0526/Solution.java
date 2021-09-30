package com.codegym.task.task05.task0526;

/* 
Man and woman

*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Donald", 100, "123 faggot lane");
        Man man2 = new Man("Stanfield", 50, "Scammer lane");
        Woman woman1 = new Woman("Gayleigh", 30, "Tawtcaller ln");
        Woman woman2 = new Woman("Tiffany", 25, "Fuck you too");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman1);
        System.out.println(woman2);

    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;

        }

        public String toString() {
            return  name + " " + age + " " + address;
        }
    }

    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString() {
            return name + " " + age +
                    " " + address;
        }
    }
}
