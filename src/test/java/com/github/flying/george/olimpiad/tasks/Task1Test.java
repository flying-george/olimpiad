package com.github.flying.george.olimpiad.tasks;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by george.
 */
public class Task1Test {

    @Test
    public void caseOne() {
        final Task1Solver solver = new Task1Solver(5000, 4000, 3600);
        Assert.assertEquals(2600, solver.getAlesha());
        Assert.assertEquals(1400, solver.getDobrynia());
        Assert.assertEquals(1000, solver.getIlya());
    }

    @Test
    public void caseTwo() {
        final Task1Solver solver = new Task1Solver(50, 50, 50);
        Assert.assertEquals(50, solver.getAlesha());
        Assert.assertEquals(0, solver.getDobrynia());
        Assert.assertEquals(0, solver.getIlya());
    }
}
