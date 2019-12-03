package com.exercise;

public class StrKeBil {
    public static void main(String [] Args) {
        String st = new String ("123.45");
        Double bil = new Double (Double.valueOf(st)); // sekaligus method

        System.out.println("Isi bil = " +st);
        System.out.println("Jika isinya ditambah satu,");
        System.out.println("isinya menjadi " + (bil+1));
    }
}
