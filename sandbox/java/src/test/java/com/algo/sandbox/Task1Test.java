package com.algo.sandbox;

import org.junit.Assert;
import org.junit.Test;

public class Task1Test {
    @Test
    public void testSolution() {
        Task1 task = new Task1();
        Assert.assertEquals(1, task.solution("aabbb"));
        Assert.assertEquals(0, task.solution("ba"));
        Assert.assertEquals(1, task.solution("aaa"));
        Assert.assertEquals(1, task.solution("b"));
        Assert.assertEquals(0, task.solution("abba"));
    }
}
