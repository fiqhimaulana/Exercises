package com.exercise;

import java.util.Scanner;

public class Atau {
    public static void main (String [] Args) {
        System.out.print("Masukkan nilai : ");
        Scanner kbd = new Scanner (System.in);
        int a = kbd.nextInt();
        kbd.close();

        if (a > 60 && a < 100 ) {
            System.out.println("Lulus");
        } else if (a < 60) {
            System.out.println("Tidak Lulus");
        }
        else {
            System.out.println("Nilai tidak boleh lebih dari 100");
        }
    }
}
