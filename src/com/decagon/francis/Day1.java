package com.decagon.francis;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day1 {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }
    public static double findUniq(double []arr) {
        ArrayList<Double> list = new ArrayList<>();
        for (double v : arr) {
            list.add(v);
        }
        double ddd = 0.0;
        for (Double dd : list) {
            if (Collections.frequency(list,dd) ==1){
                ddd= dd;;
            }
        }
        Arrays.sort(arr);
        for (int i = 0; i <arr.length-1; i++) {
            if (arr[i] != arr[i+1]){
                ddd= arr[i];
            }
        }
        return ddd;
    }
}
