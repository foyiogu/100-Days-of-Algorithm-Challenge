package com.decagon.francis;

import java.util.List;

public class Day4 {
    public static void main(String[] args) {

    }
    //FIRST ONE
    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        int minDist = 0;
        long combinations = 1 << ls.size();
        for (long i = 0; i < combinations; i++) {
            int cnt = 0;
            int sum = 0;
            for (int j = 0; j <= ls.size(); j++) {
                long bit = 1 << j;
                if ((i & bit) == bit) {
                    sum += ls.get(j);
                    cnt++;
                    if (cnt > k) break;
                }
            }
            if (cnt == k && sum <= t && sum > minDist) {
                minDist = sum;
            }
        }

        return minDist > 0 ? minDist : null;
    }

    //SECOND ONE
    public static double[] crusoe(int n, double d, int ang, double distmult, double angmult) {
        double x = 0.0, y = 0.0, a = ang * Math.PI / 180.0;
        for (int i = 1; i <= n; i++) {
            x += d * Math.cos(a);
            y += d * Math.sin(a);
            d *= distmult;
            a *= angmult;
        }
        return new double[] {x, y};
    }
}
