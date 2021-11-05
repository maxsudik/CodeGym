package com.codegym.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Expressing ourselves more concisely

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        String minString = strings.get(0);
        for (String element : strings) {
            if (element.length() < minString.length()) {
                minString = element;
            }
        }
        for(String element : strings){
            if (element.length()==minString.length()){
                System.out.println(element);
            }
        }

    }
}
