package com.codegym.task.task11.task1123;

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair<Integer, Integer> result = getMinimumAndMaximum(data);
        String s = "qwe";

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndMaximum(int[] array) {

        int min = array[0];
        int max = array[0];
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }
        //write your code here
        else {
            for (int number : array){
                if(number< min){
                    min=number;
                } else if(number > max){
                    max = number;
                }
            }
        }


        return new Pair<Integer, Integer>(min, max);
    }


    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
