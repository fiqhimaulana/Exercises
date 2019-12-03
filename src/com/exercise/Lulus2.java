package com.exercise;

import java.util.Scanner;

public class Lulus2 {
    public static void main (String [] Args) {
        System.out.printf("Masukkan Nilai (0-100) : ");
        Scanner nil = new Scanner (System.in);
        int nilai = nil.nextInt();
        nil.close();

        String a;
        if (nilai >= 60) {
            a= "Lulus";
        }
        else {
            a= "TIdak Lulus";
        }
        System.out.println("Hasil : \"" +a+"\"");

    }
}
