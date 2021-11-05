package com.codegym.task.task05.task0528;

/* 
Display today's date

*/

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;

public class Solution {
    public static void main(String[] args) {
        //write your code here

        DateFormat dateFormat = new SimpleDateFormat("MM dd yyyy");
        Date date = new Date();
        String print = dateFormat.format(date);
        System.out.println(print);





    }
}
