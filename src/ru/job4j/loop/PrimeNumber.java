package ru.job4j.loop;

public class PrimeNumber {

    @SuppressWarnings("checkstyle:EmptyBlock")
    public static int calc(int finish) {
        int count = 0;
        for (int number = 0; number < finish; number++) {
            if (CheckPrimeNumber.check(number)) {
                count += 1;
            }
        }
        return count;
    }
}