package com.algo.sandbox;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Task52 {
    public int solution(int[] a) {
        int n = a.length;
        long curSum = 0;
        int relocated = 0;

        List<Integer> negatives = new ArrayList<>();

        for (int ai : a) {
            curSum += ai;

            if (ai < 0) {
                negatives.add(ai);
            }

            if (curSum < 0) {
                relocated++;
                curSum -= findMin(negatives);
            }
        }

        return relocated;
    }

    public int betterSolution(int[] a) {
        int relocated = 0;
        int curSum = 0;

        PriorityQueue<Integer> negatives = new PriorityQueue<>();

        for (int ai : a) {
            if (ai < 0) {
                negatives.offer(ai);
            }

            curSum += ai;
            if (curSum < 0) {
                relocated++;
                curSum -= negatives.poll();
            }
        }

        return relocated;
    }


    private int findMin(List<Integer> numbers) {
        int min = 0;

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < numbers.get(min)) {
                min = i;
            }
        }

        int minValue = numbers.get(min);
        numbers.set(min, 0);

        return minValue;
    }
}
