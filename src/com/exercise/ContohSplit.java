package com.exercise;

public class ContohSplit {
    public static void main(String [] Args) {
        String fiq = new String("Paris:Jakarta:Amsterdam:Roma:Berlin");

        String[] kota = fiq.split(":");

        for (int a=0; a<kota.length; a++) System.out.println(kota[a]);
    }
}
