package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60; /* формула перевода рублей в доллары. */
    }

    public static void main(String[] args) {
        float rubles = 140f;
        float euroInRubles = Converter.rubleToEuro(rubles);
        float dollarInRubles = Converter.rubleToDollar(rubles);
        System.out.println(rubles + " rubles are " + euroInRubles  + " euro.");
        System.out.println(rubles + " rubles are " + dollarInRubles + " dollar.");
    }
}

