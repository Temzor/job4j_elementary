package ru.job4j.condition;

public class SqArea {
    public static double square (int p, int k){
        int h = p / (2 * (k + 1));
        int l = h * k;
        int s = l * h;
        return s;
    }


    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2,  area of a triangle = " + result);
    }
}
