package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void whenExistTrue() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertTrue(result);
    }

    @Test
    public void whenExistFalse() {
        double ab = 2.0;
        double ac = 5.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        Assert.assertFalse(result);
    }
}