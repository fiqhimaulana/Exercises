package com.exercise;
import java.util.Scanner;

public class Lingkaran {
    public static void main(String[] args) {
        System.out.print("Masukkan Nilai jari-jari Lingkaran:");
        Scanner kbd = new Scanner(System.in);
        double radius = kbd.nextDouble();
        kbd.close();

        double Luas = 3.14 * radius * radius;
        double Keliling = 2 * 3.14 * radius;

        System.out.println("Luas="+Luas);
        System.out.println("Keliling="+Keliling);
    }
}
