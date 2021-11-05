package com.codegym.task.task15.task1518;

/* 
Static modifiers and kittens

*/

public class Solution {
    static {
        Cat cat = new Cat();
        cat.name = "New Cat";
        Solution.cat = cat;
        System.out.println(cat.name);

    }
    public static Cat cat;

    public static class Cat {
        public String name;
    }

    public static void main(String[] args) {

    }
}
