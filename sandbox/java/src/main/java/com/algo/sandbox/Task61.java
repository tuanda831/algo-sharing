package com.algo.sandbox;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task61 {
    public int solution(String s, int[] c) {
        Map<Character, List<Integer>> charPositions = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charPositions.computeIfAbsent(
                    s.charAt(i),
                    k -> new ArrayList<>()
            ).add(i);
        }

        int minInsertionNeeded = 0;

        for (List<Integer> positions : charPositions.values()) {
            if (positions.size() == 1) continue;

            int cIndex = 0;

            for (int i = 0; i < positions.size() - 1; i++) {
                int left = positions.get(i);
                int right = positions.get(i + 1);
                boolean found = false;

                while (cIndex < c.length) {
                    if (left < c[cIndex] && right >= c[cIndex]) {
                        cIndex++;
                        found = true;
                        break;
                    }

                    cIndex++;
                }

                if (!found) {
                    return -1;
                }
            }

            minInsertionNeeded = Math.max(minInsertionNeeded, cIndex);
        }

        return minInsertionNeeded;
    }
}