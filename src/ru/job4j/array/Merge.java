package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int i = 0; i < left.length; i++) {
            result[i] = left[i];
        }
        for (int r = left.length; r < result.length; r++) {
                result[r] = right[r - left.length];
            }
        return result;
    }
}