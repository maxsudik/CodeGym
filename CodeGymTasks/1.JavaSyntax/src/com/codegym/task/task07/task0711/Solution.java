package com.codegym.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Remove and insert

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        String string;

        ArrayList<String> strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<5; i++){
            strings.add(reader.readLine());
        }

        for(int i=0; i<13; i++){
            string =strings.get(4);
            strings.remove(4);
            strings.add(0, string);
        }

        for(String element : strings){
            System.out.println(element);
        }
    }
}
