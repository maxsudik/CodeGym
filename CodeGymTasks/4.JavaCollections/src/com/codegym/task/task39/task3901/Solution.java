package com.codegym.task.task39.task3901;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/* 
Unique substrings

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your string: ");
        String s = bufferedReader.readLine();

        System.out.println("The longest unique substring length is: \n" + lengthOfLongestUniqueSubstring(s));
    }

    public static int lengthOfLongestUniqueSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        } else {
            HashMap<Integer, Integer> mk = new HashMap<Integer, Integer>();
            int greatest = 0;//length of longest repeating substring
            int currentIndex = 0; //starting index of longest non-repeating substring
            int index = 0;
            //System.out.println(s);

            while (index < s.length()) {
                //System.out.println("Letter is "+s.charAt(index)+", greatest is "+greatest+", currentIndex is "+currentIndex);
                int key = (int) s.charAt(index);

                if (mk.containsKey(key)) {

                    if (mk.get(key) >= currentIndex) {  //check if this letter is really applicable(occurs at or after the beginning of currentLongestSubstring)
                        if (index - currentIndex > greatest)//update greatest if new Longest Substring is found
                            greatest = (index - currentIndex);
                        currentIndex = mk.get(key) + 1;
                    }


                    mk.put(key, index);


                } else {
                    mk.put(key, index);
                }

                index++;

            }

            if (s.length() - currentIndex > greatest)
                greatest = (s.length() - currentIndex);//if greatest length is at end of string

            return greatest;
        }

    }
}
