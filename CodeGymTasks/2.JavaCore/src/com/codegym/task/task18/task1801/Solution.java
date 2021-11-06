package com.codegym.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Maximum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int maxByte = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();

        FileInputStream file = new FileInputStream(filename);

        while (file.available() > 0) {
            int data = file.read();
            if (maxByte < data) {
                maxByte = data;
            }
        }
        System.out.println(maxByte);
        file.close();

    }
}
