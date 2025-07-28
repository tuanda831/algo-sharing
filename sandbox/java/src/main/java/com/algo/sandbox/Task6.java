package com.algo.sandbox;

import java.util.HashMap;
import java.util.Map;

public class Task6 {
    public int solution(String s) {
        for (int i = 1; i <= s.length(); i++) {
            Map<String, Integer> presentedStrings = new HashMap<>();

            for (int j = 0; j <= s.length() - i; j++) {
                String key = s.substring(j, i + j);
                presentedStrings.merge(key, 1, Integer::sum);
            }

            if (presentedStrings.containsValue(1)) {
                return i;
            }
        }

        return s.length();
    }
}
