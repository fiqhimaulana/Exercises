package com.exercise;

import java.util.Scanner;

public class Satusdn {
    public static void main (String [] Args) {
        System.out.print("Bilangan bulat n : ");
        Scanner kbd = new Scanner(System.in);
        int a = kbd.nextInt();
        kbd.close();

        int i = 1;
        while (i <= a) {
            System.out.println(i);
            i++;
        }
    }
}
