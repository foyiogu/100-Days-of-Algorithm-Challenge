package com.decagon.francis;

public class Day5 {
    public static void main(String[] args) {

    }
    //FIRST ONE
    public static long[] NumbersWithDigitInside(long x, long d){
    long sum = 0;
    long count = 0;
    long product = 1;
        for (int i = 1; i <= x; i++) {
        if((i + "").contains(d + "")) {
            product *= i;
            sum += i;
            count++;
        }
    }
        return new long[]{count, sum, count == 0 ? 0 : product};
}

    //SECOND ONE
    public static int dontGiveMeFive(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (!(String.valueOf(i).contains("5") )){
                count++;
            }
        }
        return count;
    }
}
