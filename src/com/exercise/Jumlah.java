package com.exercise;

public class Jumlah {
    public static void main(String[] Args) {
        int z = jumlah(2, 3);
        System.out.println("z = " +z);

        int b = jumlah(4, 3);
        System.out.println("b = " +b);
    }

    private static int jumlah(int m, int n) {
            return (m + n);
    }
}
