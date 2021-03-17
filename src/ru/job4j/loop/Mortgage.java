package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 0;
       while (amount > 0) {
           if (amount < salary) {
               amount += (amount * percent) / 100;
               amount -= salary;
               year += 1;
           } else {
               break;
           }
        }
        return year;
    }
}
