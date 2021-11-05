package com.codegym.task.task03.task0319;

/* 
Predictions

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String sNumber = reader.readLine();
        int nNumber1 = Integer.parseInt(sNumber);
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println(name + " will receive" + " " + nNumber1 + " in " + number2 + " years.");

    }
}
