package com.exercise;

public class RataRata {
    public static void main(String[] Args) {

        // Inisialisasi Array
        int hasil[] = new int []{70, 80, 75, 90, 65, 66, 72, 81, 82};

        // Peroleh jumlah data
        int jum_data = hasil.length;

        // Hitung jumlah untuk semua nilai di hasil
        int total = 0;
        for (int i =  0; i < jum_data; i++) {
            total += hasil[i]; // total = total + hasil[i]
        }

        // Hitung nilai rata-ratanya
        double rerata = (double) (total / jum_data);

        // Tampilkan nilai rerata
        System.out.println("Rata-rata = " +rerata);
    }
}
