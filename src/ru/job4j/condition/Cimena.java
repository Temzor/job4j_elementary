package ru.job4j.condition;

import javax.sound.midi.Soundbank;

public class Cimena {
    public static void acess(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= 18) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }

    }

    public static void main(String[] args) {
        Cimena.acess(21);
        Cimena.acess(16);

    }
}
