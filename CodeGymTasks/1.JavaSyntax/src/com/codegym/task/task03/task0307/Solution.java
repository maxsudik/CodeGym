package com.codegym.task.task03.task0307;

/* 
Hello, StarCraft!

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Zerg zerg1 = new Zerg();
        zerg1.name = "qwe1";
        Zerg zerg2 = new Zerg();
        zerg2.name = "qwe2";
        Zerg zerg3 = new Zerg();
        zerg3.name = "qwe3";
        Zerg zerg4 = new Zerg();
        zerg4.name = "qwe4";
        Zerg zerg5 = new Zerg();
        zerg5.name = "plkmn";

        Protoss protoss1 = new Protoss();
        Protoss protoss2 = new Protoss();
        Protoss protoss3 = new Protoss();
        protoss1.name = "p1";
        protoss2.name = "p2";
        protoss3.name = "p3";

        Terran terran = new Terran();
        Terran terran1 = new Terran();
        Terran terran2 = new Terran();
        Terran  terran3 = new Terran();
        terran.name = "asd1";
        terran2.name = "asd2";
        terran1.name = "qweasdzxc";
        terran3.name = "asdetgg";
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
