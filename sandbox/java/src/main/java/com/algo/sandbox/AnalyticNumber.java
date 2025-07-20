package com.algo.sandbox;

import java.util.HashMap;
import java.util.Map;

public class AnalyticNumber {

    private long duplicateBranchCutted = 0;
    private long recursiveCount = 0;

    public long bruteForce(int n) {
        if (n == 0) {
            return 1;
        }

        long result = bruteForce(n, n);
        return result;
    }

    public long bruteForce(int n, int maxVal) {
        recursiveCount++;
        if (n == 0) return 1;

        if (n < 0) return 0;

        if (maxVal == 0) {
            return 0;
        }

        long waysIncludingMaxVal = bruteForce(n - maxVal, maxVal);
        long waysExcludeMaxVal = bruteForce(n, maxVal - 1);

        return waysIncludingMaxVal + waysExcludeMaxVal;
    }

    public long bruteForceWithMemo(int n) {
        if (n == 0) {
            return 1;
        }

        Map<String, Long> memo = new HashMap<>();

        long result = bruteForceWithMemo(n, n, memo);

        return result;
    }

    public long bruteForceWithMemo(int n, int maxVal, Map<String, Long> memo) {
        recursiveCount++;
        if (n == 0) return 1;

        if (n < 0) return 0;

        if (maxVal == 0) {
            return 0;
        }

        String memoKey = String.format("%d-%d", n, maxVal);
        if (memo.containsKey(memoKey)) {
            duplicateBranchCutted++;
            return memo.get(memoKey);
        }

        long waysIncludingMaxVal = bruteForceWithMemo(n - maxVal, maxVal, memo);
        long waysExcludeMaxVal = bruteForceWithMemo(n, maxVal - 1, memo);

        memo.put(memoKey, waysIncludingMaxVal + waysExcludeMaxVal);

        return waysIncludingMaxVal + waysExcludeMaxVal;
    }

    public long dynamicProgrammingWithTabulation(int n) {
        long[][] tabulation = new long[n + 1][n + 1];
        tabulation[0][0] = 1;

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                long waysIncludingMaxVal = (i - j < 0) ? 0 : tabulation[i - j][j];
                long waysExcludeMaxVal = (j - 1 < 0) ? 0 : tabulation[i][j - 1];
                tabulation[i][j] = waysIncludingMaxVal + waysExcludeMaxVal;
            }
        }

        return tabulation[n][n];
    }

}
