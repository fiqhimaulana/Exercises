package com.exercise;
import java.util.Scanner;

public class NamaUsia {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);

        System.out.print("Nama Anda:");
        String nama = kbd.nextLine();

        System.out.print("Usia:");
        int usia = kbd.nextInt();

        System.out.println("Hai "+nama+".");
        System.out.println("Usia mu saat ini: "+usia);

    }
}
