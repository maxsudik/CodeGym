package com.codegym.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Mastering the static block

*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        //write your code here
        try {
            reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static CanFly result;

    public static void reset() throws IOException {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        if (line.equals("helicopter")) {
            result = new Helicopter();
        } else if (line.equals("plane")) {
            result = new Plane(1);
        }
        reader.close();
    }
}
