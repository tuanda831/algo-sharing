package com.algo.sandbox;

import junit.framework.TestCase;

public class Task51Test extends TestCase {
    final Task51 task51 = new Task51();

    public void testSolution() {
        assertEquals(25, task51.solution(new int[]{2, 3, 5, 2, 3, 4, 6, 4, 1}));
        assertEquals(35, task51.solution(new int[]{1, 5, 3, 2, 6, 6, 10, 4, 7, 2, 1}));
        assertEquals(10, task51.solution(new int[]{1, 2, 3, 3, 2}));
        assertEquals(15, task51.solution(new int[]{5, 10, 3}));
        assertEquals(13, task51.solution(new int[]{10, 3}));
        assertEquals(0, task51.solution(new int[]{5}));
    }
}