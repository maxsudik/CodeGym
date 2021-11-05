package com.codegym.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Words in reverse

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        for (int i=0; i<5; i++){
            strings.add(reader.readLine());
        }

        strings.remove(2);

        Collections.reverse(strings);

        for(int i=0; i<strings.size(); i++){
            System.out.println(strings.get(i));
        }
    }
}


