package com.exercise;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ElemenTerbesar {
    public static void main(String[] Args) {

        // inisialisasi Array
        int daftar[] = new int []{20, 4, 19, 9, 94, 28, 8, 95};

        // peroleh bilangan terbesar
        int terbesar = daftar[0];

        for (int i = 0; i < daftar.length; i++) {
            if (terbesar < daftar[i])
                terbesar = daftar[i];
        }
        System.out.println("Elemen terbesar di Array : " +terbesar);

        // get max or min using Arrays.stream in java 8 and getAsInt
        System.out.println("Elemen terbesar di Array menggunakan Array.stream : "
                + Arrays.stream(daftar).max().getAsInt());

    }
}
