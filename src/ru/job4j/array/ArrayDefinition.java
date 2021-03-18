package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];

        System.out.println("Размер массива равен типа данных short: " + ages.length);
        System.out.println("Размер массива равен типа  данных String: " + surnames.length);
        System.out.println("Размер массива равен типа данных float: " + prices.length);

        String[] names = new String[4];
        names[0] = "Petr Arsentev";
        names[1] = "Obama Baraсk";
        names[2] = "Trump Donald";
        names[3] = "Richard Nixon";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);

    }
}
