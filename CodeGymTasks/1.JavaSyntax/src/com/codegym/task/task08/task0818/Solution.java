package com.codegym.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Only for the rich

*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //write your code here
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Name1", 1000);
        people.put("Name2", 900);
        people.put("Name3", 800);
        people.put("Name4", 700);
        people.put("Name5", 600);
        people.put("Name6", 500);
        people.put("Name7", 400);
        people.put("Name8", 300);
        people.put("Name9", 200);
        people.put("Name10", 100);

        return people;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //write your code here
        HashMap<String, Integer> copy = new HashMap<>(map);
        for(Map.Entry<String, Integer> pair : copy.entrySet()){
            if(pair.getValue()<500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}