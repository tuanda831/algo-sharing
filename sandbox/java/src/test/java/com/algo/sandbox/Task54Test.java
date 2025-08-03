package com.algo.sandbox;

import junit.framework.TestCase;

public class Task54Test extends TestCase {
    private final Task54 task54 = new Task54();
    public void testSolution() {
        assertEquals(4, task54.solution("<><??>>"));
    }
}