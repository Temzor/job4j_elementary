package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import java.awt.geom.Area;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        int expected = 6;
        int p = 18;
        int k = 6;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}