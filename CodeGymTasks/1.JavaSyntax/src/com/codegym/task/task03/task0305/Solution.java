package com.codegym.task.task03.task0305;

/* 
Red scare

*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        BirthDate me = new BirthDate("JANUARY", 14, 1990);
    }

    public static class BirthDate{
        int date;
        String month;
        int year;

        public BirthDate(String month, int date, int year){
            this.month = month;
            this.date = date;
            this.year = year;
            System.out.println(month + " " + date + " " + year);
        }
    }
}
