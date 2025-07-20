package com.algo.sandbox;

import junit.framework.TestCase;

public class AnalyticNumberTest extends TestCase {
    private  AnalyticNumber problem = new AnalyticNumber();
    public void testBruteForce() {
//        assertEquals(7L, problem.bruteForce(5));
//        assertEquals(1958L, problem.bruteForce(25));
//        assertEquals(37338L, problem.bruteForce(40));
//        assertEquals(966467L, problem.bruteForce(60));
        assertEquals(190569292L, problem.bruteForce(100));
    }

    public void testBruteForceWithMemo() {
//        assertEquals(7L, problem.bruteForceWithMemo(5));
//        assertEquals(1958L, problem.bruteForceWithMemo(25));
//        assertEquals(37338L, problem.bruteForceWithMemo(40));
//        assertEquals(966467L, problem.bruteForceWithMemo(60));
        assertEquals(190569292L, problem.bruteForceWithMemo(100));
    }

    public void testDynamicProgrammingWithTabulation() {
//        assertEquals(7L, problem.dynamicProgrammingWithTabulation(5));
//        assertEquals(1958L, problem.dynamicProgrammingWithTabulation(25));
//        assertEquals(37338L, problem.dynamicProgrammingWithTabulation(40));
//        assertEquals(966467L, problem.dynamicProgrammingWithTabulation(60));
        assertEquals(190569292L, problem.dynamicProgrammingWithTabulation(100));
    }
}