package com.codegym.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* 
Ascending numbers

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> array = new ArrayList<>();

        //write your code here
        for (int i=0; i<5; i++){
            array.add(Integer.parseInt(reader.readLine()));
        }

        Collections.sort(array);
        for (int  number : array){
            System.out.println(number);
        }
    }
}
