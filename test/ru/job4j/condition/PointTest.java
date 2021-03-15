package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when00to20then2() {
        int expected = 2;
        int x1 = 0;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double out  = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to20then1() {
        int expected = 1;
        int x1 = 1;
        int x2 = 0;
        int y1 = 2;
        int y2 = 0;
        double out  = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to30then1() {
        double expected = 2.82;
        int x1 = 1;
        int x2 = 2;
        int y1 = 3;
        int y2 = 0;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when35to86then1() {
        double expected = 5.1;
        int x1 = 3;
        int x2 = 5;
        int y1 = 8;
        int y2 = 6;
        double out = Point.distance(x1, x2, y1, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}