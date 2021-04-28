package com.decagon.francis;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Day6 {
    public static void main(String[] args) {

    }
    //FIRST ONE
    public static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]","");
    }

    //SECOND ONE
    public static String vertMirror (String strng) {
        String[] arr = strng.split("\n");
        List<String> newarr = Arrays.stream(arr)
                .map(x -> new StringBuilder(x).reverse().toString())
                .collect(Collectors.toList());
        return String.join("\n", newarr);
    }
    public static String horMirror (String strng) {
        String[] arr = strng.split("\n");
        Collections.reverse(Arrays.asList(arr));
        return String.join("\n", arr);
    }
    public static String oper(UnaryOperator<String> operator, String s) {
        return operator.apply(s);
    }
}
