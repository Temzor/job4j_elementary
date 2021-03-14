package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70; /* формула перевода рублей в евро. */
    }

    public static int rubleToDollar(int value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {

        //Тест для метода Converter.rubleToEuro(rubles)
        int inEuro = 140;
        int expectedEuro = 2;
        int outEuro = Converter.rubleToEuro(inEuro);
        boolean passedEuro = expectedEuro == outEuro;
        System.out.println("140 rubles are 2 euro. Test result : " + passedEuro);

        //Тест для метода Converter.rubleToDollar(rubles)
        int in = 140;
        int expected = 2;
        int out = Converter.rubleToDollar(in);   // Исправлен метод вычисление доллара
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 dollar. Test result : " + passed);

    }
}

