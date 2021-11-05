package com.codegym.task.task08.task0802;

/* 
HashMap of 10 pairs

*/

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        HashMap<String, String> plants = new HashMap<>();

        plants.put("watermelon", "melon");
        plants.put("banana", "fruit");
        plants.put("cherry", "fruit");
        plants.put("pear", "fruit");
        plants.put("cantaloupe", "melon");
        plants.put("blackberry", "fruit");
        plants.put("ginseng", "root");
        plants.put("strawberry", "fruit");
        plants.put("iris", "flower");
        plants.put("potato", "tuber");

        for (Map.Entry<String, String> plant : plants.entrySet()){
            System.out.println(plant.getKey() + " - " + plant.getValue());
        }

    }
}
