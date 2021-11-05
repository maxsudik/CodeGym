package com.codegym.task.task06.task0609;

/* 
Distance between two points

*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write your code here
        double d = Math.sqrt((Math.pow((x2-x1), 2)) + Math.pow((y2-y1), 2));
        return d;
    }

    public static void main(String[] args) {

    }
}
