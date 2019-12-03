package com.exercise;

import java.util.Scanner;

public class Piramida {
    public static void main(String [] Args) {
        System.out.print("Tinggi : ");
        Scanner kbd = new Scanner (System.in);
        int t = kbd.nextInt();
        kbd.close();

        for (int b=1; b<=t; b++) {

            // buat spasi
            for (int i=1; i<=t-b; i++) {
                System.out.print(' ');
            }

            // tampilkan ^
            for (int i=1; i<2*b; i++) {
                System.out.print("^");
            }

            //pindah baris
            System.out.println();
        }
    }
}
