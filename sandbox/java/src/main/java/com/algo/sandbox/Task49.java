package com.algo.sandbox;

public class Task49 {
    public int solution(String s, int b) {
        s = s + '.';
        int n = s.length();
        int countSingle = 0;
        int countFix = 0;
        int budgetLeft = b;

        int curCount = 0;
        for (int i = 0; i < n; i++) {
            if (budgetLeft <= 1) {
                return countFix;
            }

            if (s.charAt(i) == 'x') {
                curCount++;
                continue;
            }

            if (curCount > 1) {
                if (curCount >= budgetLeft) {
                    return countFix + budgetLeft - 1;
                }

                countFix += curCount;
                budgetLeft -= curCount + 1;
                curCount = 0;
                continue;
            }

            if (curCount == 1) {
                curCount = 0;
                countSingle++;
            }
        }

        if (budgetLeft > 1) {
            if (budgetLeft/2 > countSingle) {
                return countFix + countSingle;
            }

            return  countFix + budgetLeft/2;
        }

        return countFix;
    }
}
