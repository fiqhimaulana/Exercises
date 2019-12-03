package com.exercise;

public class ContohReturn {
    public static void main(String[] Args) {
        tampilkan("Tes..Tes..123!");
        System.out.println("----------");
        tampilkan("");

    }

    private static void tampilkan(String x) {
        if (x.length() == 0) {
            System.out.println("Cobalah untuk tidak memberikan argumen");
            System.out.println("berupa string kosong");

            return;
        }

        System.out.print("Argumen : ");
        System.out.println(x);
    }
}
