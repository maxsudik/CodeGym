package com.codegym.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* 
Shuffled just in time

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        int n = Integer.parseInt(reader.readLine());
        int m = Integer.parseInt(reader.readLine());

        ArrayList<String> strings = new ArrayList<>();

        for(int i=0; i<n; i++){
            strings.add(reader.readLine());
        }

        Iterator<String> iterator = strings.iterator();

        String string;

        while(m>0){
            string = strings.get(0);
            strings.add(string);
            strings.remove(0);
            m--;
        }
        for(String element : strings){
            System.out.println(element);
        }
    }
}
