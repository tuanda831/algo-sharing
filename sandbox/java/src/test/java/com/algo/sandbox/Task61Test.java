package com.algo.sandbox;

import junit.framework.TestCase;

public class Task61Test extends TestCase {
    private Task61 task = new Task61();

    public void testTask61() {
        assertEquals(2, task.solution("aabcba", new int[]{1, 3, 2}));
        assertEquals(2, task.solution("aaa", new int[]{1, 2}));
        assertEquals(3, task.solution("aabcddcb", new int[]{3, 5, 1, 4, 7}));
        assertEquals(-1, task.solution("wkwk", new int[]{1}));
    }
}