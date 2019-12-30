package com.exercise;

public class ContohArray {
    public static void main (String[] Args) {
        int hasil[] = new int[5]; // deklarasi array dengan isi 5 elemen

        // isi setiap elemen array
        hasil[0] = 70;
        hasil[1] = 69;
        hasil[2] = 80;
        hasil[3] = 72;
        hasil[4] = 20;

        // tampilkan isi array
        for (int i = 0; i < 4; i++) {

            System.out.println(hasil[i]);

        }
    }
}
