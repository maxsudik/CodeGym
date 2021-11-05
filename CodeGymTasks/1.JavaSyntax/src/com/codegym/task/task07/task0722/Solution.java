package com.codegym.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
The end

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //write your code here
        ArrayList<String> strings = new ArrayList<>();
        String temp;

        while(true){
            temp=reader.readLine();

            if(temp.equals("end")){
                break;
            } else
            strings.add(temp);
        }

        for(String element : strings){
            System.out.println(element);
        }
    }
}