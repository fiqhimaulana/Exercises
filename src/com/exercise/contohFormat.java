package com.exercise;

public class contohFormat { // penggunaan format()
    public static void main (String[] Args) {

        String barangA = new String ("Pasta Mirabella");
        Double hargaA =  new Double (1674.25);

        String barangB = new String ("Bihun AMD 100 Gr");
        Double hargaB = new Double (890.75);

        String strFormat = "| %-25s | %8.2f |";

        System.out.println("nama barang" +"\t\t\t\t\t"+ "harga barang");

        System.out.println(String.format(strFormat, barangA, hargaA));
        System.out.println(String.format("| %-25s | %8.2f |", barangB, hargaB));
    }
}
