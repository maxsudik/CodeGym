package com.codegym.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Census

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> names = new HashMap<>();
        names.put("Last1","First1");
        names.put("Last2","First2");
        names.put("Last3","First3");
        names.put("Last4","First4");
        names.put("Last5","First5");
        names.put("Last6","First6");
        names.put("Last7","First7");
        names.put("Last8","First8");
        names.put("Last9","First9");
        names.put("Last10","First10");

        return names;

    }

    public static int getSameFirstNameCount(HashMap<String, String> map, String name) {
        //write your code here
        int counter=0;
        for(Map.Entry firstName : map.entrySet()){
            if(firstName.getValue().equals(name)){
                counter++;
            }
        }

        return counter;


    }

    public static int getSameLastNameCount(HashMap<String, String> map, String lastName) {
        //write your code here
        int counter=0;
        for(Map.Entry lName :map.entrySet()){
            if(lName.getKey().equals(lastName)){
                counter++;
            }
        }

        return counter;

    }

    public static void main(String[] args) {

    }
}
