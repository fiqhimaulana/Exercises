package com.exercise;

import java.util.Scanner;

public class TanpaDef {
    public static void main (String [] Args) {
        System.out.print("Kode Hari (0 .. 6) : ");
        Scanner kbd = new Scanner (System.in);
        int a = kbd.nextInt();
        kbd.close();

        String keterangan = "" ;
        switch (a) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                keterangan = "Hari Kerja";
                break;
            case 0:
            case 6:
                keterangan = "hari libur";
                break;
        }
        if (keterangan.isEmpty()) {
            System.out.println("Kode hari salah");
        }
        else {
            System.out.println(keterangan);
        }
    }
}
