package com.codegym.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Number of letters

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Alphabet
        String abc = "abcdefghijklmnopqrstuvwxyz";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<>();
        for (char letter : abcArray) {
            alphabet.add(letter);
        }

        // Read in strings
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //Putting list of characters into the map with counters ==0
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character character : alphabet) {
            map.put(character, 0);
        }

        //Traverse trough each string and find how many times each char from array of char is present in
        //each string

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if (map.containsKey(list.get(i).charAt(j))) {
                    map.put(list.get(i).charAt(j), map.get(list.get(i).charAt(j)) + 1);
                }
            }
        }

        for(Map.Entry item : map.entrySet()){
            System.out.println(item.getKey() + " " + item.getValue());
        }

        // write your code here
    }

}
