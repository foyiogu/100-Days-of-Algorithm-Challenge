package com.decagon.francis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Day8 {
    public static void main(String[] args) {
        System.out.println(highAndLow("1 2 -9 4 5"));
    }
    public static String highAndLow(String numbers) {
        List<Integer> list = Arrays.stream(numbers.split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String a = String.valueOf(Collections.max(list));
        String b = String.valueOf(Collections.min(list));
        return a+ " "+b;
    }
    public static String oddOrEven (int[] array) {
        int sum = 0;
        for(int i = 0; i< array.length;i++){
            sum+=array[i];
        }
        if(sum%2 == 0){
            return "even";
        }else{
            return "odd";
        }
    }
}
