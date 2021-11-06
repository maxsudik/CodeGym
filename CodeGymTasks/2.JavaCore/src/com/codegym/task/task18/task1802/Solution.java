package com.codegym.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Minimum byte

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int minByte = Integer.MAX_VALUE;


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        while(fileInputStream.available()>0){
            int data = fileInputStream.read();
            if(minByte>data){
                minByte=data;
            }
        }
        System.out.println(minByte);
        fileInputStream.close();

    }
}
