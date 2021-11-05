package com.codegym.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Longest sequence

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //write your code here
        int counter = 1;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<10; i++){
            list.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> counts = new ArrayList<>();

        for(int i=0; i<list.size()-1; i++){
            if (list.get(i).equals(list.get(i+1))){
                counter++;
            } else{
                counts.add(counter);
                counter=1;
            }
            counts.add(counter);

        }
        Collections.sort(counts);
        Collections.reverse(counts);
        System.out.println(counts.get(0));

    }
}
