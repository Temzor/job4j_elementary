package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height){
        return height - 100;
    }

    public static double womanWeight(short height){
        return height - 110;
    }


    public static void main(String[] args) {
        short height = 187;
        System.out.println( "Man " + height + " " + manWeight(height));
        System.out.println( "Woman " + height + " " + womanWeight(height));
    }
}
