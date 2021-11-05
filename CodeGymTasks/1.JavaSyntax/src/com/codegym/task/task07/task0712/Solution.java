package com.codegym.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Shortest or longest

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }

        int shortIndex = 0;
        int longIndex = 0;
        String shortString = strings.get(0);
        String longString = strings.get(0);

        for (int i = 0; i < strings.size(); i++) {
            if (strings.get(i).length() < shortString.length()) {
                shortString = strings.get(i);
                shortIndex = i;
            } else if (strings.get(i).length() > longString.length()) {
                longString =strings.get(i);
                longIndex=i;
            }
        }

        if(shortIndex<longIndex){
            System.out.println(shortString);
        } else if(shortIndex>longIndex){
            System.out.println(longString);
        }
    }
}
