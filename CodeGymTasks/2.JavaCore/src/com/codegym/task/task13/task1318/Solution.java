package com.codegym.task.task13.task1318;

import java.io.*;

/* 
Reading a file

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //read from file
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        InputStream inStream = new FileInputStream(fileName);
        
        while (inStream.available() > 0) {
            System.out.print((char)inStream.read());
        }
        reader.close();
        inStream.close();
    }
}