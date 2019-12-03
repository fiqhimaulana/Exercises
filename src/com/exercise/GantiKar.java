package com.exercise;

public class GantiKar {
    public static void main(String[] Args) {
        String wid = new String("lala lalala");

        System.out.println(wid.replace("a", "i"));
        //akan tercetak otomatis tidak perlu dicetak kembali
        System.out.println(wid.replaceAll("la", "bu"));
    }
}