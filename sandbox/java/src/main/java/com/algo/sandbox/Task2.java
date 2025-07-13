package com.algo.sandbox;

public class Task2 {
    public int solution(String s) {
        int count = 0, firstI = 0, lastI = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(firstI) == s.charAt(lastI)) {
                count++;
            }
            firstI++;
            lastI = (lastI + 1) % s.length();
        }

        return count;
    }
}
