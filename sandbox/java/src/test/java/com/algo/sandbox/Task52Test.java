package com.algo.sandbox;

import junit.framework.TestCase;

public class Task52Test extends TestCase {
    final Task52 task = new Task52();

    public void testSolution() {
        assertEquals(1, task.solution(new int[]{10, -10, -1, -1, 10}));
        assertEquals(3, task.solution(new int[]{-1, -1, -1, 1, 1, 1, 1}));
        assertEquals(0, task.solution(new int[]{5, -2, -3, 1}));
    }


    public void testBetterSolution() {
        assertEquals(1, task.betterSolution(new int[]{10, -10, -1, -1, 10}));
        assertEquals(3, task.betterSolution(new int[]{-1, -1, -1, 1, 1, 1, 1}));
        assertEquals(0, task.betterSolution(new int[]{5, -2, -3, 1}));
    }

}