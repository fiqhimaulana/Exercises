package com.exercise;

public class UraiString { // penggunaan char
    public static void main(String [] Args) {

        String nak = new String("ABCDE");

       char[] rex = nak.toCharArray();

        for (int a=0; a<nak.length(); a++)  {
            System.out.println(nak.toCharArray()[a]);

            System.out.println(rex[a]);
        }
    }
}