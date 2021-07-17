package ru.geekbrains.lesson5;

import org.junit.Assert;
import org.junit.Test;

public class RecursionTest {

    @Test
    public void normalTest(){
        Assert.assertEquals(64f, Recursion.numberToDegree(2, 6), 0);
        Assert.assertEquals(125f, Recursion.numberToDegree(5, 3), 0);
        Assert.assertEquals(0f, Recursion.numberToDegree(0, 3), 0);
        Assert.assertEquals(1f, Recursion.numberToDegree(1, 0), 0);
        Assert.assertEquals(0.04f, Recursion.numberToDegree(5, -2), 0);
        Assert.assertEquals(25f, Recursion.numberToDegree(-5, 2), 0);
    }

    @Test
    public void backpackTest(){
        int[] weights = {4,1,3};
        int[] values = {4000, 2000, 2500};
        Assert.assertEquals(4500, Backpack.recBackpackValue(weights, values, 4));
        Assert.assertEquals(2500, Backpack.recBackpackValue(weights, values, 3));
    }
}