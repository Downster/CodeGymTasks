package com.codegym.task.task05.task0505;

/* 
Feline carnage

*/

public class Solution {
    public static void main(String[] args) {
        Cat ralph = new Cat("ralph",8,8, 8);
        Cat rondo = new Cat("rondo", 7, 5, 8);
        Cat rena = new Cat("rena", 5, 7, 10);
        System.out.println(ralph.fight(rena));
        System.out.println(ralph.fight(rondo));
        System.out.println(rondo.fight(rena));

    }

    public static class Cat {
        protected String name;
        protected int age;
        protected int weight;
        protected int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }

        public boolean fight(Cat anotherCat) {
            int ageAdvantage = this.age > anotherCat.age ? 1 : 0;
            int weightAdvantage = this.weight > anotherCat.weight ? 1 : 0;
            int strengthAdvantage = this.strength > anotherCat.strength ? 1 : 0;

            int score = ageAdvantage + weightAdvantage + strengthAdvantage;
            return score > 2; // return score > 2 ? true : false;
        }
    }
}
