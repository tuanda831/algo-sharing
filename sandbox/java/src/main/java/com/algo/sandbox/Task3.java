package com.algo.sandbox;

public class Task3
{
    public int Solution(int N) {
        if (N < 10) {
            return N;
        }
        String result = String.format("%d", N % 9);

        for (int i = 0; i < N / 9; i++) {
            result += "9";
        }

        return Integer.parseInt(result);
    }
}
