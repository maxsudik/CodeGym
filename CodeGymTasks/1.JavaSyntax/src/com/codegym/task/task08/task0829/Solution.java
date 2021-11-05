package com.codegym.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Software update

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // List of addresses
        Map<String, String> addresses = new HashMap<>();
        while (true) {
            //System.out.println("Enter City");
            String city = reader.readLine();
            if (city.isEmpty()) break;
            //System.out.println("Enter family name");
            String family = reader.readLine();


            addresses.put(city, family);
        }

        // Read the house number
        //System.out.println("Enter looking city");
        String lookForCity = reader.readLine();

        for (Map.Entry<String, String> pair : addresses.entrySet()) {
            if(pair.getKey().equals(lookForCity)){
                String familyName = pair.getValue();
                System.out.println(familyName);
            }
        }
    }
}
