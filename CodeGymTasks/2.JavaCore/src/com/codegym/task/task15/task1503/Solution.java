package com.codegym.task.task15.task1503;

/* 
OOP: Cars

*/

import java.util.concurrent.CompletionService;

public class Solution {
    public static void main(String[] args) {
        new Solution.LuxuryCar().printlnDesire();
        new Solution.CheapCar().printlnDesire();
        new Solution.Ferrari().printlnDesire();
        new Solution.GeoMetro().printlnDesire();
    }

    public static class LuxuryCar extends Constants{

        protected void printlnDesire() {
            System.out.println(WANT_STRING + LUXURY_CAR);
        }

    }

    public static class CheapCar extends Constants{

        protected void printlnDesire() {
            System.out.println(WANT_STRING + CHEAP_CAR);
        }

    }

    public static class Ferrari extends LuxuryCar {
        @Override
        public void printlnDesire() {
            //write your code here
            System.out.println(WANT_STRING + FERRARI_NAME);
        }
    }

    public static class GeoMetro extends CheapCar {

        @Override
        public void printlnDesire() {
            //write your code here
            System.out.println(WANT_STRING + GEO_METRO_NAME);
        }
    }

    public static class Constants {
        public static String WANT_STRING = "I want to drive ";
        public static String LUXURY_CAR = "a luxury car";
        public static String CHEAP_CAR = "a cheap car";
        public static String FERRARI_NAME = "a Ferrari";
        public static String GEO_METRO_NAME = "a Geo Metro";
    }
}
