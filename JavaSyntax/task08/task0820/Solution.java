package com.codegym.task.task08.task0820;

import java.util.HashSet;
import java.util.Set;

/* 
Animal set

*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<Cat>();
        Cat tilly = new Cat();
        Cat dilly = new Cat();
        Cat rilly = new Cat();
        Cat silly = new Cat();
        cats.add(tilly);
        cats.add(dilly);
        cats.add(rilly);
        cats.add(silly);
        return cats;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs = new HashSet<>();
        Dog drew = new Dog();
        Dog ruth = new Dog();
        Dog slop = new Dog();
        dogs.add(drew);
        dogs.add(ruth);
        dogs.add(slop);
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);
        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
    }

    public static void printPets(Set<Object> pets) {
        for (Object o : pets) {
            System.out.println(o);
        }
    }

    public static class Cat {

    }

    public static class Dog {

    }
}
