package com.exercise;

public class TrimExample {
    public static void main (String [] Args) {
        String rof = new String ("  football match beetwen PSM v Bali  ");

        System.out.println("Jumlah karakter sebelum trim() :" +rof.length());
        System.out.println("Jumlah karakter setelah trim() ;" +rof.trim().length());
    }
}
