package com.decagon.francis;

import java.util.Arrays;
import java.util.List;

public class Day7 {
    public static void main(String[] args) {
        System.out.println(accum("abcd"));
    }
    //FIRST ONE
    public static String accum(String s) {
        String sb = "";
        int lent = s.length();
        List<String> list=Arrays.asList(s.toUpperCase().split(""));
        for (int i = 0; i < lent; i++) {
            sb+=list.get(i) + list.get(i).substring(0,1).repeat(i).toLowerCase() + "-";
        }
        return sb.substring(0,sb.length()-1);
    }
}
