package com.algo.sandbox;

import java.util.Arrays;

public class Task51 {
    public int solution(int[] a) {
        int n = a.length;
        int[][] dp = new int[4][n];
        Arrays.fill(dp[0], 0);

        for (int k = 1; k <= 3; k++) {
            for (int i = 1; i < n; i++) {
                //Option 1: Don't take a[i]
                int option1 = dp[k][i - 1];

                //Option 2: Take a[i]
                int option2 = ((i >= 2) ? dp[k - 1][i - 2] : 0) + (a[i - 1] + a[i]);

                dp[k][i] = Math.max(option1, option2);
            }
        }

        int max1 = (n >= 2) ? dp[1][n - 1] : 0;
        int max2 = (n >= 4) ? dp[2][n - 1] : 0;
        int max3 = (n >= 6) ? dp[3][n - 1] : 0;

        return Math.max(Math.max(max1, max2), max3);
    }
}
