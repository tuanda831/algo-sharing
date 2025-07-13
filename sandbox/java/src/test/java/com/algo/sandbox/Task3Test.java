package com.algo.sandbox;

import org.junit.Assert;
import org.junit.Test;

public class Task3Test {
    @Test
    public void testSolution() {
        Task3 task = new Task3();
        Assert.assertEquals(79, task.Solution(16));
        Assert.assertEquals(199, task.Solution(19));
        Assert.assertEquals(7, task.Solution(7));
        Assert.assertEquals(599999, task.Solution(50));
    }
}
