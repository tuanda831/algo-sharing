package com.algo.sandbox;

import org.junit.Assert;
import org.junit.Test;

public class Task2Test {
    @Test
    public void testSolution() {
        Task2 task = new Task2();
        Assert.assertEquals(3, task.solution("abbaa"));
        Assert.assertEquals(4, task.solution("aaaa"));
        Assert.assertEquals(0, task.solution("abab"));
    }
}
