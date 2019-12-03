package com.exercise;

public class Rerata {
    public static void main(String[] args) {
        int total = 18;
        int cacah = 4;

        double ratarata = total/cacah;
        System.out.println("rata-rata=" + ratarata);

        ratarata= (double) total / cacah;
        System.out.printf("rata-rata=%.1f" ,ratarata);
    }
}
