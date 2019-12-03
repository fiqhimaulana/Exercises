package com.exercise;

import java.util.Scanner;

public class Lulus {
    public static void main (String [] Args) {
        System.out.printf("Masukkan nilai (0-100) : ");
        Scanner nil = new Scanner (System.in);
        int nilai = nil.nextInt();
        nil.close();

        String hasil = "tidak lulus";

        if (nilai >= 60) {
            hasil = "lulus";
        }
        System.out.println("Hasil : " +hasil);
    }
}
