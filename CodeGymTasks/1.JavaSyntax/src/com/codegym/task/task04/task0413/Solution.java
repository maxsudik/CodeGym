package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int dayOfWeek = Integer.parseInt(reader.readLine());
        if (dayOfWeek < 1 || dayOfWeek > 7) {
            System.out.println("No such day of the week");
        } else if (dayOfWeek == 1) {
            System.out.println("Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("Tuesday");
        } else if (dayOfWeek==3){
            System.out.println("Wednesday");
        } else if(dayOfWeek==4){
            System.out.println("Thursday");
        } else if(dayOfWeek==5){
            System.out.println("Friday");
        } else if(dayOfWeek==6){
            System.out.println("Saturday");
        } else if(dayOfWeek==7){
            System.out.println("Sunday");
        }
    }
}