package com.exercise;

import java.util.Scanner;

public class Kondisi {
    public static void main (String[] Args) {
        System.out.print("Bilangan bulat : ");
        Scanner kbd = new Scanner (System.in);
        int a = kbd.nextInt();
        kbd.close();

        System.out.print("Bilangan :" +a);
        System.out.println("adalah bilangan : " +(a % 2 ==0 ? "Genap" : "Ganjil"));
    }
}
