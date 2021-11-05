package com.codegym.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Checking the order

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        boolean check;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();
        for(int i=0; i<10; i++){
            strings.add(reader.readLine());
        }

        for(int i=0; i<strings.size()-1; i++){
            check = strings.get(i).length()<=strings.get(i+1).length();
            if(!check){
                System.out.println(i+1);
            }
        }
    }
}

