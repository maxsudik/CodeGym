package com.codegym.task.task07.task0702;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
String array in reverse order

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here

        String[] array = new String[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for(int i=0; i<8; i++){
            array[i] = reader.readLine();
        }

        for (int i=array.length-1; i>=0; i--){
            System.out.println(array[i]);
        }
    }
}