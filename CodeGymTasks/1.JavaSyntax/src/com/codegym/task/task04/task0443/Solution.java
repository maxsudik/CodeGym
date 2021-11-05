package com.codegym.task.task04.task0443;


/* 
A name is a name

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        int bYear = Integer.parseInt(reader.readLine());
        int bMonth = Integer.parseInt(reader.readLine());
        int bDay = Integer.parseInt(reader.readLine());

        System.out.println("My name is " + name + ".");
        System.out.println("I was born on " + bMonth + "/" +bDay + "/" + bYear);
    }
}
