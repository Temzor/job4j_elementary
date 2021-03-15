package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 179;
        double expected = 69;                                //Будет ошибка, т.к. по формуле (179 - 110) = 79.35
        double out = Fit.womanWeight(in);
        Assert.assertEquals(out, expected, 0.01);      //Тест не пройден  параметр expected должен быть 79.35
    }
}