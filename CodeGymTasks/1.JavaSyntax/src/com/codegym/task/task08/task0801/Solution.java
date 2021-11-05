package com.codegym.task.task08.task0801;

/* 
HashSet of plants

*/

import java.util.HashSet;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        HashSet<String> plants = new HashSet<>();

        plants.add("watermelon");
        plants.add("banana");
        plants.add("cherry");
        plants.add("pear");
        plants.add("cantaloupe");
        plants.add("blackberry");
        plants.add("ginseng");
        plants.add("strawberry");
        plants.add("iris");
        plants.add("potato");

        for(String plant : plants){
            System.out.println(plant);
        }

    }
}
