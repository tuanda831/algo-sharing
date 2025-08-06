package com.algo.sandbox;

import junit.framework.TestCase;

public class Task47Test extends TestCase {
    private final Task47 task = new Task47();

    public void testSolution() {
        assertEquals(3, task.solution("abacdec"));
        assertEquals(1, task.solution("world"));
        assertEquals(4, task.solution("dddd"));
        assertEquals(2, task.solution("cycle"));
        assertEquals(2, task.solution("abba"));
    }
}