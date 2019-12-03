package com.exercise;

import javax.swing.*;
import java.util.Scanner;

public class Hari {
    public static void main (String [] Args) {
        System.out.print("Kode Hari (0..6) : ");
        Scanner kbd = new Scanner (System.in);
        int a = kbd.nextInt();
        kbd.close();

        String namaHari = "kode hari salah!";
        //String[] b = new String[]{"minggu, senin, selasa, rabu, kamis, jumat, sabtu"};
        //String c = String.valueOf(b);

        if (a == 0)
            namaHari = "Minggu";
            else
                if (a == 1)
                    namaHari = "Senin";
                else
                    if (a ==2)
                        namaHari = "Selasa";
                    else
                        if (a == 3)
                            namaHari = "Rabu";
                        else
                            if (a == 4)
                                namaHari = "Kamis";
                            else
                                if (a == 5)
                                    namaHari = "Jumat";
                                else
                                    if (a == 6)
                                        namaHari = "Sabtu";
        System.out.println("Kode hari : " +a);
        System.out.println("Nama hari : " +namaHari);
    }
}
