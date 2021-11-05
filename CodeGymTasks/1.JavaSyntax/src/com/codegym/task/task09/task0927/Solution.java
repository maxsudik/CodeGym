package com.codegym.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Ten cats

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //write your code here
        Map<String, Cat> catsMap = new HashMap<>();
        catsMap.put("Bob1", new Cat("Bob1"));
        catsMap.put("Bob2", new Cat("Bob2"));
        catsMap.put("Bob3", new Cat("Bob3"));
        catsMap.put("Bob4", new Cat("Bob4"));
        catsMap.put("Bob5", new Cat("Bob5"));
        catsMap.put("Bob6", new Cat("Bob6"));
        catsMap.put("Bob7", new Cat("Bob7"));
        catsMap.put("Bob8", new Cat("Bob8"));
        catsMap.put("Bob9", new Cat("Bob9"));
        catsMap.put("Bob10", new Cat("Bob10"));

        return catsMap;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //write your code here

        Set<Cat> catsSet = new HashSet<>();
        catsSet.addAll(map.values());

        return catsSet;

    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
