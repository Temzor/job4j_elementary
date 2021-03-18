package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {
    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int source = 0;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {4, 2, 3, 1};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap2to3() {
        int[] input = {1, 2, 3, 4};
        int source = 2;
        int dest = input.length - 1;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {1, 2, 4, 3};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSwap0to5() {
        int[] input = {1, 2, 3, 4, 5, 6};
        int source = 0;
        int dest = input.length - 2;
        int[] result = SwitchArray.swap(input, source, dest);
        int[] expected = {5, 2, 3, 4, 1, 6};
        Assert.assertArrayEquals(expected, result);
    }
}