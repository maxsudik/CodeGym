package com.codegym.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Going national

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //write your code here

        char[] chars = s.toCharArray();

        for(int i=0; i<chars.length; i++){
            if(i==0){
                chars[i] = Character.toUpperCase(chars[i]);
            } else if(chars[i]>=1 && chars[i-1]==' '){
                chars[i] = Character.toUpperCase(chars[i]);
            }
        }

        System.out.println(chars);
    }
}
