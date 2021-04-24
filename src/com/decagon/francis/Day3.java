package com.decagon.francis;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day3 {
    public static void main(String[] args) {

    }
    //FIRST ONE
    public static int duplicateCount(String text) {
        int count = 0;
        String[] arr = text.toLowerCase().split("");
        Map<String, Integer> map = new HashMap<>();
        for (String s : arr) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                count++;
            }
        }
        return count;
    }

    //SECOND ONE
    public int sum(List<?> mixed) {
       return mixed.stream().mapToInt(s-> Integer.parseInt(String.valueOf(s))).sum();

    }
}
