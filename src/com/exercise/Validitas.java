package com.exercise;

import java.util.Scanner;

public class Validitas {
    public static void main(String [] Args) {

        int bil =5;
        Scanner kbd = new Scanner (System.in);

        boolean ok;
        do {
            ok = true;
            System.out.print("Masukkan sebuah bilangan bulat : ");
            try {
                bil = kbd.nextInt();
            }
            catch (Exception e) {
                System.out.println("Pemasukkan data salah !");
                ok = false;
                kbd.nextLine();  // buang data tersisa
            }
        } while (!ok);

        System.out.println("Oke anda memasukkan bilangan : " +bil);
        kbd.close();
    }
}
