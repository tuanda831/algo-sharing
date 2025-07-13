package com.algo.sandbox;

public class Task1 {
    public int solution(String s) {
        char last = 'a';
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != last) {
                if (last == 'b') {
                    return 0;
                }
                last = 'b';
            }
        }

        return 1;
    }
}
