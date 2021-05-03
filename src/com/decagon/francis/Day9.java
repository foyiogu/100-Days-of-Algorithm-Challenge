package com.decagon.francis;

public class Day9 {
    public static void main(String[] args) {

    }
    //FIRST ONE
    public static int potatoes(int p0, int w0, int p1) {
        return w0 * (100 - p0) / (100 - p1);
    }

    //SECOND ONE
    public static int[] race(int v1, int v2, int g) {
        int d = v2 - v1;
        if (d <= 0) return null;
        int h = g / d;
        int r = g % d;
        int mn = r * 60 / d;
        int s = (r * 60 % d) * 60 / d;
        return new int[]{h, mn, s};
    }
}
