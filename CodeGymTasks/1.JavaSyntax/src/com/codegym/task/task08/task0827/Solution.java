package com.codegym.task.task08.task0827;

/*
Working with dates

*/

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        /**
         * 1) get year from the passed string
         * 2) get difference in days between passed and first day of the year
         * 3) check if the difference is odd or even;
         * 4) return boolean
         */


        String[] dates = date.split("\\s");
        int monthNumber = -1;
        int day = Integer.valueOf(dates[1]);
        int year = Integer.valueOf(dates[2]);
        Map<Integer, String> months = new HashMap<>();
        months.put(0, "JANUARY");
        months.put(1, "FEBRUARY");
        months.put(2, "MARCH");
        months.put(3, "APRIL");
        months.put(4, "MAY");
        months.put(5, "JUNE");
        months.put(6, "JULY");
        months.put(7, "AUGUST");
        months.put(8, "SEPTEMBER");
        months.put(9, "OCTOBER");
        months.put(10, "NOVEMBER");
        months.put(11, "DECEMBER");

        for (Map.Entry<Integer, String> month : months.entrySet()) {
            if (month.getValue().equals(dates[0])) {
                monthNumber = month.getKey();
            }
        }
        //System.out.println(monthNumber + " " + day + " " + year);

        Calendar calendarLate = new GregorianCalendar(year, monthNumber, day);
        Calendar calendarFirst = new GregorianCalendar(year, 0, 1);
        long daysSince = (calendarLate.getTimeInMillis()/1000/60/60/24);
        long daysBeginning = (calendarFirst.getTimeInMillis()/1000/60/60/24);
        long diff = daysSince-daysBeginning;
        return diff % 2 == 0;
    }
}
