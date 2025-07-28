package com.algo.sandbox;

public class Task5 {

    public int solution(int[] a) {
        if (a.length == 0) return 0;

        int moves = 0;
        int curNum = a[0];
        int curNumCount = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] != curNum) {
                moves += getBestMove(curNum, curNumCount);
                curNum = a[i];
                curNumCount = 0;
            }

            curNumCount++;
        }

        return moves + getBestMove(curNum, curNumCount);
    }

    private int getBestMove(int curNum, int curNumCount) {
        if (curNumCount >= curNum) {
            return curNumCount - curNum;
        }

        if (curNumCount > curNum / 2) {
            return curNum - curNumCount;
        }

        return curNumCount;
    }
}
