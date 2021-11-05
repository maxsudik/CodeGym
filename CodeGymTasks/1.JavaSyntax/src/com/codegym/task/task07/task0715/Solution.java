package com.codegym.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
More Sam-I-Am

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "Sam", "I", "Am");

        for(int i=1; i<strings.size()+1; i+=2){
            strings.add(i, "Ham");
        }

        for(String element : strings){
            System.out.println(element);
        }
    }
}
