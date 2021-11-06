package com.codegym.task.task18.task1807;

/* 
Counting commas

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        int numberComas =0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);

        while(fileInputStream.available()>0){
            if (fileInputStream.read() == 44){
                numberComas++;
            }
        }
        System.out.println(numberComas);
        reader.close();
        fileInputStream.close();

    }
}
