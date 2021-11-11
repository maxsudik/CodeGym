package com.codegym.task.task18.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Extending AmigoOutputStream

*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream stream;

    public QuestionFileOutputStream(AmigoOutputStream stream) {
        this.stream = stream;
    }

    @Override
    public void flush() throws IOException {
        stream.flush();
    }

    @Override
    public void write(int b) throws IOException {
        stream.write(b);

    }

    @Override
    public void write(byte[] b) throws IOException {
        stream.write(b);

    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        stream.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Do you really want to close the stream? Y/N");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer = reader.readLine();
        if (answer.equals("Y")) {
            stream.close();
        }
    }
}

