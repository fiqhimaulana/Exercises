package com.exercise;

import java.util.Scanner;

public class nkeSatu {
    public static void main (String [] Args) {
        System.out.print("Bilangan bulat n : ");
        Scanner kbd = new Scanner (System.in);
        int a = kbd.nextInt();
        kbd.close();

        int i = a;
        while (i > 0) {
            System.out.println(i);

            i--;
        }
    }
}
