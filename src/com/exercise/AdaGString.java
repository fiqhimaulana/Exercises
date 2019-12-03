package com.exercise;

public class AdaGString {
    public static void main(String[] args) {
        String mar = new String("Seputih kapas");
        String wid = new String("putih");
        String fiq = new String("Putih");
        String tik = new String("Se");
        String tok = new String("Dompet");

        System.out.println("Apakah \""+wid+"\" terdapat di \""+mar+"\"? " +mar.contains(wid));
        System.out.println("Apakah \""+fiq+"\" terdapat di \""+mar+"\"? " +mar.contains(fiq));

        System.out.println("Posisi \""+tik+"\" di \""+mar+"\" ada di indeks " +mar.indexOf(tik));
        System.out.println("Posisi t  di \""+mar+"\" ada di indeks " +mar.indexOf("t")); //dikutip

        System.out.println("Apakah \""+tok+"\" berawalan \"Do\" " +tok.startsWith("Do"));
        System.out.println("Apakah \""+tok+"\" berawalan \"pet\" " +tok.startsWith("pet"));

        System.out.println("Apakah \""+fiq+"\" berakhiran \"tih\" " +fiq.endsWith("tih"));
    }
}
