package com.algo.sandbox;

import java.util.HashMap;
import java.util.Map;

public class Task47 {
    public int solution(String s) {
        Map<Character, Boolean> occur = new HashMap<>();
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            Character key = s.charAt(i);
            if (occur.containsKey(key)) {
                count++;
                occur = new HashMap<>();
            }

            occur.put(key, true);
        }

        return count;
    }
}
