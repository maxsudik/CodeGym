package com.codegym.task.task19.task1906;

/* 
Even characters

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        FileReader fileReader = new FileReader(fileName1);
        FileWriter fileWriter = new FileWriter(fileName2);

        boolean isOridinal = false;
        while(fileReader.ready()){
            int i = fileReader.read();
            if(isOridinal){
                fileWriter.write(i);
                isOridinal = false;
            } else{
                isOridinal = true;
            }
        }
        reader.close();
        fileReader.close();
        fileWriter.close();
    }

}
