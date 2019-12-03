package com.exercise;

public class rgb {

    public static void main(String [] Args) {

        String lit = new String ("Key>Board>Door>Window>Curtain");

        String [] back = lit.split(">");// metode
         for (int c = 0; c < back.length; c++) System.out.println(back[c]);
    }
}
