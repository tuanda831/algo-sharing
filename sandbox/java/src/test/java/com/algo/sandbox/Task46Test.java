package com.algo.sandbox;

import junit.framework.TestCase;

public class Task46Test extends TestCase {
    Task46 solution = new Task46();

    public void testBruteForce() {
//        assertEquals(4, solution.bruteforce("..xx.x.", "x.x.x.."));
//        assertEquals(6, solution.bruteforce(".xxx...x", "..x.xxxx"));
//        assertEquals(5, solution.bruteforce("xxxxx", ".x..x"));
//        assertEquals(2, solution.bruteforce("x...x", "..x.."));

        String l1 = "x".repeat(5000);
        String l2 = ".".repeat(5000);
        assertEquals(5000, solution.bruteforce(l1, l2));
    }

    public void testBruteforceWithMemo() {
//        assertEquals(4, solution.bruteforceWithMemo("..xx.x.", "x.x.x.."));
//        assertEquals(6, solution.bruteforceWithMemo(".xxx...x", "..x.xxxx"));
//        assertEquals(5, solution.bruteforceWithMemo("xxxxx", ".x..x"));
//        assertEquals(2, solution.bruteforceWithMemo("x...x", "..x.."));

        String l1 = "x".repeat(5000);
        String l2 = ".".repeat(5000);
        assertEquals(5000, solution.bruteforceWithMemo(l1, l2));
    }
}