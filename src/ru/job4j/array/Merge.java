package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0;
        for (int r = 0; r < result.length; r++) {
            if (i > left.length - 1) {
                int l = right[j];
                result[r] = l;
                j++;
            } else if (j > right.length - 1) {
                int l = left[i];
                result[r] = l;
                i++;
            } else if (left[i] < right[j]) {
                int l = left[i];
                result[r] = l;
                i++;
            } else {
                int m = right[j];
                result[r] = m;
                j++;
            }

        }
        return result;
    }
}