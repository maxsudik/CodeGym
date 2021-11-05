package com.codegym.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Shared last names and first names

*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        //write your code here
        Map<String, String> people = new HashMap<>();
        people.put("LName1", "FName1");
        people.put("LName2", "FName2");
        people.put("LName3", "FName3");
        people.put("LName1", "FName1");
        people.put("LName5", "FName4");
        people.put("LName7", "FName5");
        people.put("LName7", "FName1");
        people.put("LName8", "FName3");
        people.put("LName2", "FName6");
        people.put("LName10", "FName8");




        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
