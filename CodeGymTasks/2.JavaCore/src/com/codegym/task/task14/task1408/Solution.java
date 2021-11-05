package com.codegym.task.task14.task1408;

/* 
Chicken factory

*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Continent.AFRICA);
        hen.getMonthlyEggCount();
    }

    static class HenFactory implements Continent {

        static Hen getHen(String continent) {
            Hen hen = null;
            //write your code here
            if (continent.equals(NORTHAMERICA)) {
                hen = new NorthAmericanHen();
            } else if(continent.equals(EUROPE)){
                hen = new EuropeanHen();
            } else if (continent.equals(ASIA)){
                hen = new AsianHen();
            } else if (continent.equals(AFRICA)){
                hen = new AfricanHen();
            }
            return hen;
        }
    }
}
