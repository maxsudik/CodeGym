package com.codegym.task.task18.task1816;

/* 
ABCs

*/

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        int counter =0;
        FileInputStream fileInputStream = new FileInputStream(args[0]);
        while(fileInputStream.available()>0){
            char i = (char)fileInputStream.read();
            String s = String.valueOf(i);
            if(s.matches("[a-zA-Z]")){
                counter++;
            }

        }
        System.out.println(counter);
        fileInputStream.close();
    }

}
