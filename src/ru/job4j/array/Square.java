package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < rst.length; index++) {
            rst[index] = (int) Math.pow(index, 2);    // или rst[index] = index * index
        }
        return rst;
    }

    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index : array) {
            System.out.println(index);
        }
    }
}