package com.decagon.francis;

import java.util.Arrays;
import java.util.List;

public class Day7 {
    public static void main(String[] args) {
//        System.out.println(accum("abcd"));
//        System.out.println(century(89));
    }
    //FIRST ONE
    public static String accum(String s) {
        StringBuilder sb = new StringBuilder();
        int lent = s.length();
        List<String> list=Arrays.asList(s.toUpperCase().split(""));
        for (int i = 0; i < lent; i++) {
            sb.append(list.get(i)).append(list.get(i).substring(0, 1).repeat(i).toLowerCase()).append("-");
        }
        return sb.substring(0,sb.length()-1);
    }

    //SECOND ONE
    public static int century(int number) {
        String first = String.valueOf(number);
        String sub = first.substring(0,2);
        if (first.startsWith(sub) && first.endsWith("00")){
            return number/100;
        } else {
            return (number/100) +1;
        }
    }

}
