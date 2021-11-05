package com.codegym.task.task14.task1408;

public class NorthAmericanHen extends Hen {

    @Override
    int getMonthlyEggCount() {
        return 10;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " I come from " + NORTHAMERICA + ". I lay " + getMonthlyEggCount() + " eggs a month.";    }
}
