package com.exercise;

import java.util.Scanner;

public class Majemuk {
    public static void main (String [] Args) {
        System.out.printf("Bilangan bulat : ");
        Scanner kbd = new Scanner (System.in);
        int a = kbd.nextInt();
        kbd.close();

        if (a % 2==1) {
            System.out.println("Bilangan " +a);
            System.out.println("Bilangan Ganjil");
        }
        else {
            System.out.println("Bilangan " +a);
            System.out.println("Bilangan Genap");
        }
    }
}
