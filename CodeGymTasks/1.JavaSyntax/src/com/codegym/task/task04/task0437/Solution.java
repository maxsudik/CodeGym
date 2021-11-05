package com.codegym.task.task04.task0437;


/* 
Triangle of eights

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        int counter =1;

        for(int j=1; j<=10; j++) {
            for (int i = 1; i <= counter; i++) {
                System.out.print(8);
            }
            System.out.println();
            counter++;
        }


    }
}
