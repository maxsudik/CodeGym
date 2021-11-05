package com.codegym.task.task03.task0322;

import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        while (true) {
            String x = String.valueOf(reader.read());
            System.out.println(x);
        }
    }
    }

