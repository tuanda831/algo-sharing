package com.algo.sandbox;

import junit.framework.TestCase;

public class Task55Test extends TestCase {
    private Task55 task = new Task55();

    public void testSolution() {
        assertEquals(19, task.solution(new int[]{1, 3, 6, 1, 6, 6, 9, 9}));
    }
}