package com.algo.sandbox;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Fibonacci {
    public long bruteForceUsingStackMem(int n) {
        if (n <= 2) return 1;

        return bruteForceUsingStackMem(n - 1) + bruteForceUsingStackMem(n - 2);
    }

    public long bruteForceUsingHeapMem(int n) {
        if (n <= 2) return 1;
        Stack<Integer> stack = new Stack<>();
        long result = 0;

        stack.push(n);
        while (!stack.isEmpty()) {
            int current = stack.pop();

            if (current <= 2) {
                result += 1;
                continue;
            }

            stack.push(current - 1);
            stack.push(current - 2);
        }

        return result;
    }

    public long memoization(int n) {
        Map<Integer, Long> mem = new HashMap<>();
        return memoization(n, mem);
    }

    public long memoization(int n, Map<Integer, Long> mem) {
        if (n <= 2) return 1;

        if (mem.containsKey(n)) {
            return mem.get(n);
        }

        long result = memoization(n - 1, mem) + memoization(n - 2, mem);
        mem.put(n, result);

        return result;
    }

    public long dynamicProgramming(int n) {
        if (n <= 2) return 1;

        long[] dp = new long[n + 1];
        dp[1]=1;
        dp[2]=1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public long dynamicProgrammingWithSlidingWindow(int n) {
        if (n <= 2) return 1;
        long n1 = 1L, n2 = 1L;

        for (int i = 3; i <= n; i++) {
            long temp = n1;
            n1 += n2;
            n2 = temp;
        }

        return n1;
    }

}
