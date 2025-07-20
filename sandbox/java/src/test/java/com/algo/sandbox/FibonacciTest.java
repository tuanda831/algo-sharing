package com.algo.sandbox;

import junit.framework.TestCase;

public class FibonacciTest extends TestCase {
    private Fibonacci fib = new Fibonacci();

    public void testBruteForceUsingStackMem() {
        assertEquals(1, fib.bruteForceUsingStackMem(1));
        assertEquals(1, fib.bruteForceUsingStackMem(2));
        assertEquals(2, fib.bruteForceUsingStackMem(3));
        assertEquals(3, fib.bruteForceUsingStackMem(4));
        assertEquals(5, fib.bruteForceUsingStackMem(5));
    }

    public void testBruteForceUsingHeapMem() {
        assertEquals(1, fib.bruteForceUsingHeapMem(1));
        assertEquals(1, fib.bruteForceUsingHeapMem(2));
        assertEquals(2, fib.bruteForceUsingHeapMem(3));
        assertEquals(3, fib.bruteForceUsingHeapMem(4));
        assertEquals(5, fib.bruteForceUsingHeapMem(5));
        assertEquals(75025L, fib.bruteForceUsingHeapMem(25));
    }

    public void testMemoization() {
        assertEquals(1, fib.memoization(1));
        assertEquals(1, fib.memoization(2));
        assertEquals(2, fib.memoization(3));
        assertEquals(3, fib.memoization(4));
        assertEquals(5, fib.memoization(5));
        assertEquals(75025L, fib.memoization(25));
        assertEquals(535601498209671957L, fib.memoization(5000));
    }

    public void testDynamicProgramming() {
        assertEquals(1, fib.dynamicProgramming(1));
        assertEquals(1, fib.dynamicProgramming(2));
        assertEquals(2, fib.dynamicProgramming(3));
        assertEquals(3, fib.dynamicProgramming(4));
        assertEquals(5, fib.dynamicProgramming(5));
        assertEquals(75025L, fib.dynamicProgramming(25));
        assertEquals(535601498209671957L, fib.dynamicProgramming(5000));
    }

    public void testdynamicProgrammingWithSlidingWindow() {
        assertEquals(1, fib.dynamicProgrammingWithSlidingWindow(1));
        assertEquals(1, fib.dynamicProgrammingWithSlidingWindow(2));
        assertEquals(2, fib.dynamicProgrammingWithSlidingWindow(3));
        assertEquals(3, fib.dynamicProgrammingWithSlidingWindow(4));
        assertEquals(5, fib.dynamicProgrammingWithSlidingWindow(5));
        assertEquals(75025L, fib.dynamicProgrammingWithSlidingWindow(25));
        assertEquals(535601498209671957L, fib.dynamicProgrammingWithSlidingWindow(5000));
    }
}