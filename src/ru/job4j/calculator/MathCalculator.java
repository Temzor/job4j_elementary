package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum1(first, second)+ multiply(first, second);
    }

    public static double differenceAndDiv(double first, double second) {
        return div(first, second) + difference(first, second);
    }

    public static double all(double first, double second) {
        return sumAndMultiply(first, second) + differenceAndDiv(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
    }
}