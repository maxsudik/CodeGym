package com.codegym.task.task19.task1907;

/* 
Counting words

*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileReader fileReader = new FileReader(fileName);

        StringBuilder builder = new StringBuilder();
        int counter =0;
        while(fileReader.ready()){
            char c = (char)fileReader.read();
            builder.append(c);
        }
        //System.out.println(builder);
        String s = builder.toString();
        String [] words = s.split("[\\W]");
        for (int i=0; i< words.length; i++){
            if(words[i].equals("world")){
                counter++;
            }
        }
        System.out.println(counter);
        reader.close();
        fileReader.close();
    }
}
