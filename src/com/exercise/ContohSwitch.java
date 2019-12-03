package com.exercise;

import java.util.Scanner;

public class ContohSwitch {
    public static void main (String [] Args) {
        System.out.print("Kode Hari (0 .. 6) : ");
        Scanner kbd = new Scanner (System.in);
        int a = kbd.nextInt();
        kbd.close();

        String b;
        switch(a) {
            case 0:
                b = "Mingggu";
                break;
            case 1:
                b = "Senin";
                break;
            case 2:
                b = "Selasa";
                break;
            case 3:
                b = "Rabu";
                break;
            case 4:
                b = "Kamis";
                break;
            case 5:
                b = "Jumat";
                break;
            case 6:
                b = "Sabtu";
                break;
            default:
                b = "Kode hari salah!";
        }
        System.out.println("Kode Hari : " +a);
        System.out.println("Nama Hari : " +b);
    }
}
