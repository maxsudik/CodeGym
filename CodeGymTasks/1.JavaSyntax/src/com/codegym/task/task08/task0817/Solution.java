package com.codegym.task.task08.task0817;

import java.util.*;

/* 
We don't need repeats

*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //write your code here
        HashMap<String, String> fullNames = new HashMap<>();
        fullNames.put("LName1", "FName1");
        fullNames.put("LName2", "FName2");
        fullNames.put("LName3", "FName3");
        fullNames.put("LName4", "FName1");
        fullNames.put("LName5", "FName3");
        fullNames.put("LName6", "FName4");
        fullNames.put("LName7", "FName2");
        fullNames.put("LName8", "FName5");
        fullNames.put("LName9", "FName6");
        fullNames.put("LName10", "FName4");

        return fullNames;
    }

    public static void removeFirstNameDuplicates(Map<String, String> map) {
        //write your code here

        HashMap<String, String> copy = new HashMap<>(map);
        ArrayList<String> list = new ArrayList<>();

        for(Map.Entry<String, String> pair : copy.entrySet()){
            if(Collections.frequency(map.values(), pair.getValue())>1){
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {


    }
}
