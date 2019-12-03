package com.exercise;

public class Lebar {
    public static void main(String[] args) {
        String st = new String ("123abcde");
        int x = 94;

        System.out.printf("%18s\n",  st);
        System.out.printf("%12s%15s\n", st, st);
        System.out.printf("%s%12s%13s\n", st,st,st);

        System.out.printf("%11d%11d\n", x,x);
        System.out.printf("%16d\n", x);

        System.out.println("rata kanan:");
        System.out.printf("%10s\n", "nakku");
        System.out.printf("%15s\n", "warkop");
        System.out.printf("%15s\n", "baring");
        System.out.println("----------------------");

        System.out.println("rata kiri:");
        System.out.printf("%-8s\n", "bukan");
        System.out.printf("%-15s\n", "tempat");
        System.out.printf("%-15s\n", "mojok");
        System.out.print("----------------\n");
    }
}
