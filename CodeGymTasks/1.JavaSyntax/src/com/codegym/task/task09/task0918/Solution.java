package com.codegym.task.task09.task0918;

/* 
We're all friends here, even the exceptions

*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
    }
    
    static class MyException extends Throwable {
    }

    static class MyException2 extends ClassNotFoundException{
    }

    static class MyException3 extends RuntimeException{
    }

    static class MyException4 extends IllegalStateException{
    }
}

