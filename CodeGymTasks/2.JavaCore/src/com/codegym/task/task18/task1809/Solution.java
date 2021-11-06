package com.codegym.task.task18.task1809;

/* 
Reversing a file

*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fileInputReader = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        if (fileInputReader.available() > 0) {
            byte[] buffer = new byte[fileInputReader.available()];
            byte[] reversedBuffer = new byte[fileInputReader.available()];
            fileInputReader.read(buffer);
            int index = 0;

            for (int i = buffer.length - 1; i >= 0; i--) {
                reversedBuffer[index] = buffer[i];
                index++;
            }
            fileOutputStream.write(reversedBuffer);
        }
        fileInputReader.close();
        fileOutputStream.close();
    }
}
