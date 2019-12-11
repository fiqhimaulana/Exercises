package com.exercise;

public class Rekursif {

    public static void main(String[] Args) {

       // long hasil = faktorial(1);
        //System.out.println("5! = " +hasil);
        System.out.println("7! = " +faktorial(7));
    }

    private static long faktorial(long n) {

        if (n <= 0) {
            return (1);
        }
        else
            return (n * faktorial(n-1)); // fungsi balik
    }
}
