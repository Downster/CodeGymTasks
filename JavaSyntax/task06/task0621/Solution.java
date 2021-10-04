package com.codegym.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Cat relations

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandfatherName = reader.readLine();
        Cat catGrandfather = new Cat(grandfatherName);

        String grandmotherName = reader.readLine();
        Cat catGrandmother = new Cat(grandmotherName);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName, catGrandfather, 'M');

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandmother, 'F');

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandfather);
        System.out.println(catGrandmother);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat parent;
        private Cat parent2;
        private char sex;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parent, Cat parent2) {
            this.name = name;
            this.parent = parent;
            this.parent2 = parent2;

        }
        Cat(String name, Cat parent, char sex) {
            this.name = name;
            this.parent = parent;
            this.sex = sex;
        }


        @Override
        public String toString() {
            if (parent == null) {
                return "The cat's name is " + name + ", no mother, no father ";
            } if (sex == 'M') {
                return "The cat's name is " + name + ", no mother, " + parent.name + " is the father";
            } if (sex == 'F') {
                return "The cat's name is " + name + ", " + parent.name + " is the mother, no father";
            } else {
                return "The cat's name is " + name + ", " + parent.name + " is the mother, " + parent2.name + " is the father";
            }
        }
    }

}
