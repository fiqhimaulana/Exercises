package com.exercise;

public class ContohTrim {
    public static void main (String [] Args) {
        String mar = new String(" biru, biru, biru ");

        System.out.println("Jumlah karakter sebelum trim() :" +mar.length());
        System.out.println("Jumlah karskter setelah trim() :" +mar.trim().length());
        // trim memotong spasi spasi sebelum dan sesudah
    }

}
