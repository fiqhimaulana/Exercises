package com.exercise;

public class DigitPecahan {
    public static void main(String[] args) {
        double dec = 123.8765;
        System.out.println("tanpa apa apa: " +dec);
        System.out.printf("0 digit: %.0f\n", dec);
        System.out.printf("1 digit: %.1f\n", dec);
        System.out.printf("2 digit: %.2f\n", dec);
        System.out.println("10 digit: ");
        System.out.printf("3 decimal: %10.3f\n", dec);
    }
}
