package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = data[0];
        int counter = 0;
        for (boolean datum : data) {
            if (result == datum) {
                counter += 1;
            }
        }
        return counter == data.length;
    }
}
