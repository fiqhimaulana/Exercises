package com.exercise;

import java.util.Scanner;

public class Hari2 {
    public static void main(String[] Args) {

        System.out.print("Kode Hari (0..6) : ");
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        kbd.close();

        String namaHari = "kode hari salah!";
        String[] b = new String[]{"minggu", "senin", "selasa", "rabu", "kamis", "jumat", "sabtu"};
        // String c = String.valueOf(b);

        if (a > 6) {
            System.out.println(namaHari);
        } else {
            System.out.println("Kode hari : " + a);
            System.out.println("Nama hari : " + b[a]);
        }
    }
}