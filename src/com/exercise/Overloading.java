package com.exercise;

public class Overloading {
    public static void main(String[] Args) {
        info("Tes..tes..123!");
        info(123);
        info("Lihatlah bilangan ini : ",123);
    }

    private static void info(String st) {
        System.out.println("anda memasukkan string \"" +st+ "\"");
    }
    public static void info(int bil) {
        System.out.println("Well, kau masukkan bilangan: \"" + bil + "\"");
    }
    public static void info(String pesan, int bil) {
        System.out.println(pesan + bil);
    }
}
