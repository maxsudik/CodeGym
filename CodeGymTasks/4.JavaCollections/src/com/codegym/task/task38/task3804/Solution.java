package com.codegym.task.task38.task3804;

/* 
Exception factory

*/

public class Solution {
    public static void main(String[] args) {
        ExceptionFactory.getException(ApplicationExceptionMessage.SOCKET_IS_CLOSED);
    }

    public static Class getFactoryClass() {
        return ExceptionFactory.class;
    }
}
