package com.codegym.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Kind Emma and the summer holidays

*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone1", df.parse("JUNE 1 1980"));
        map.put("Stallone2", df.parse("JULY 1 1980"));
        map.put("Stallone3", df.parse("AUGUST 1 1980"));
        map.put("Stallone4", df.parse("SEPTEMBER 1 1980"));
        map.put("Stallone5", df.parse("OCTOBER 1 1980"));
        map.put("Stallone6", df.parse("NOVEMBER 1 1980"));
        map.put("Stallone7", df.parse("DECEMBER 1 1980"));
        map.put("Stallone8", df.parse("JANUARY 1 1980"));
        map.put("Stallone9", df.parse("JUNE 20 1980"));
        map.put("Stallone10", df.parse("JULY 1 2000"));

        //write your code here

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //write your code here
        ArrayList<String> summerKeys = new ArrayList<>();

        for(Map.Entry person : map.entrySet()){
            if(person.getValue().toString().contains("Jun") ||person.getValue().toString().contains("Jul") || person.getValue().toString().contains("Aug")){
                summerKeys.add((String) person.getKey());
            }
        }
        for(int i=0; i<summerKeys.size(); i++){
            map.remove(summerKeys.get(i));
        }

    }

    public static void main(String[] args) throws ParseException {
        HashMap<String, Date> newMap = createMap();

//        System.out.println(newMap);
//        removeAllSummerPeople(newMap);
//        System.out.println(newMap);


    }
}
