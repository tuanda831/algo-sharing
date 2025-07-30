package com.algo.sandbox;

import junit.framework.TestCase;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task61Test extends TestCase {
    private Task61 task = new Task61();

    public void testTask61() {
        assertEquals(2, task.solution("aabcba", new int[]{1, 3, 2}));
        assertEquals(2, task.solution("aaa", new int[]{1, 2}));
        assertEquals(3, task.solution("aabcddcb", new int[]{3, 5, 1, 4, 7}));
        assertEquals(-1, task.solution("wkwk", new int[]{1}));

        String s = IntStream.range(0, 50000).mapToObj(i -> "a").collect(Collectors.joining());
        int[] a = IntStream.range(0, 50000).map(i -> 50000 - i - 1).toArray();
        assertEquals(49999, task.solution(s, a));
    }
}