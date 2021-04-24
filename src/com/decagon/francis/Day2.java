package com.decagon.francis;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Day2 {
    public static void main(String[] args) {

    }
    //FIRST ONE
    public static String revRot(String strng, int sz) {
        if(strng==null||sz<=0||sz>strng.length()) return "";

        return toChunks(strng,sz).stream()
                .map(Day2::reverseOrRotate)
                .collect(Collectors.joining());
    }

    private static List<String> toChunks(String strng, int sz) {
        List<String> chunks = new ArrayList<>();
        for (int i = 0; i + sz <= strng.length(); i += sz) {
            chunks.add(strng.substring(i, i + sz));
        }
        return chunks;
    }

    private static String reverseOrRotate(String chunk){
        if(isSumDivisibleByTwo(chunk)){
            return new StringBuilder(chunk).reverse().toString();
        } else {
            return chunk.substring(1,chunk.length())+chunk.substring(0,1);
        }
    }

    private static boolean isSumDivisibleByTwo(String chunk){
        return chunk.chars().map(i -> i-48).sum() % 2 == 0;
    }

    //SECOND ONE
    public static int sumOfAngles(int n) {
        return (n-2)*180;
    }
}
