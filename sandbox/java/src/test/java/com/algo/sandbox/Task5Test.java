package com.algo.sandbox;

import junit.framework.TestCase;

import java.util.stream.IntStream;

public class Task5Test extends TestCase {
    private Task5 task = new Task5();

    public void testSolution() {
        assertEquals(3, task.solution(new int[]{1, 1, 3, 4, 4, 4}));
        assertEquals(4, task.solution(new int[]{1, 2, 2, 2, 5, 5, 5, 8}));
        assertEquals(5, task.solution(new int[]{1, 1, 1, 1, 3, 3, 4, 4, 4, 4, 4}));
        assertEquals(3, task.solution(new int[]{10, 10, 10}));

        assertEquals(100_000 - 10, task.solution(IntStream
                .generate(() -> 10)
                .limit(100_000)
                .toArray())
        );
    }
}