package com.codegym.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import static java.util.Comparator.comparing;

/* 
Longest string

*/

public class Solution {
    private static List<String> strings;
    
    public static void main(String[] args) throws Exception {

        int maxLength=0;

        strings = new ArrayList<>();
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        for(int i=0; i<5; i++){
            strings.add(reader.readLine());
        }

        for(int i=0; i<strings.size(); i++){
            if(strings.get(i).length()>maxLength){
                maxLength=strings.get(i).length();
            }
        }

        for(int i=0; i<strings.size(); i++){
            if(strings.get(i).length()==maxLength){
                System.out.println(strings.get(i));
            }
        }

    }
}
