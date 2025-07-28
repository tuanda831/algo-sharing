package com.algo.sandbox;

import junit.framework.TestCase;

public class Task6Test extends TestCase {
    private Task6 task = new Task6();

    public void testSolution() {
        assertEquals(2, task.solution("abaaba"));
        assertEquals(5, task.solution("zyzyzyz"));
        assertEquals(3, task.solution("aabbbabaaa"));
    }
}