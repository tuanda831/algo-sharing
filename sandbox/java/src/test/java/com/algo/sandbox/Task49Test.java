package com.algo.sandbox;

import junit.framework.TestCase;

public class Task49Test extends TestCase {
    private final Task49 task = new Task49();

    public void testSolution() {
        assertEquals(5, task.solution("...xxx..x....xxx.", 7));
        assertEquals(3, task.solution("..xxxxx", 4));
        assertEquals(6, task.solution("x.x.xxx...x", 14));
        assertEquals(0, task.solution("..", 14));
        assertEquals(0, task.solution(".x", 1));
    }
}