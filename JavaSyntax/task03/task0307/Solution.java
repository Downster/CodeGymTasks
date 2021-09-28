package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
        Zerg pleeb1 = new Zerg();
        pleeb1.name = "Pleeb1";
        Zerg pleeb2 = new Zerg();
        pleeb2.name = "Pleeb2";
        Zerg pleeb3 = new Zerg();
        pleeb3.name = "Pleeb3";
        Zerg pleeb4 = new Zerg();
        pleeb4.name = "Pleeb4";
        Zerg pleeb5 = new Zerg();
        pleeb5.name = "Pleeb5";
        Protoss boss1 = new Protoss();
        boss1.name = "Boss1";
        Protoss boss2 = new Protoss();
        boss2.name = "Boss2";
        Protoss boss3 = new Protoss();
        boss3.name = "Boss3";
        Terran loser1 = new Terran();
        loser1.name = "Loser1";
        Terran loser2 = new Terran();
        loser2.name = "Loser2";
        Terran loser3 = new Terran();
        loser3.name = "Loser3";
        Terran loser4 = new Terran();
        loser4.name = "Loser4";
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
