package com.codegym.task.task14.task1408;

public class EuropeanHen extends Hen {

    @Override
    int getMonthlyEggCount() {
        return 20;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " I come from " + EUROPE + ". I lay " + getMonthlyEggCount() + " eggs a month.";    }
}
