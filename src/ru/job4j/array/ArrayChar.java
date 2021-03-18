package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        if (word.length >= pref.length) {
            for (int index = 0; index < pref.length; index++) {
                if (word[index] == pref[index]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
                    }
        return result;
    }
}