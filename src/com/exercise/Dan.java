package com.exercise;

import java.util.Scanner;

public class Dan {
    public static void main (String [] Args) {
        System.out.print("Masukkan 1, 2, atau 3 :");
        Scanner kbd = new Scanner (System.in);
        int a = kbd.nextInt();
        kbd.close();

        if (a >= 1 && a<=3) {
            System.out.println("Trims. Anda memilih " +a);
        }
        else {
            System.out.println("Mestinya anda memilih 1, 2, atau 3");
            System.out.println("Tapi anda malah memilih "+a);
        }
    }
}