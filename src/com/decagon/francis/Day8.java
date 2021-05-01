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
        return Collections.max(list) + " " + Collections.min(list);
    }







    public static String oddOrEven (int[] array) {
        return Arrays.stream(array).sum() % 2 ==0 ? "even" : "odd";
    }
}
