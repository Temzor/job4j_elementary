package ru.job4j.condition;

public class DivideBySix {
    public static String checkNumber(int number) {
        String result;
        if (number % 3 == 0) {
            if (number % 2 == 0) {
                result = "Исходное число делится на 6.";
            } else {
                result =  "Исходное число делится на 3, но не является четным.";
            }
        } else {
            if (number % 2 == 0) {
                result =  "Исходное число не делится на 3, но является четным.";
            } else {
                result =  "Исходное число не делится на 3 и не является четным.";
            }
        }
        return result;
    }
}
