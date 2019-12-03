package com.exercise;

public class BedakanLokal {
    static int z = 99;
    public static void main(String[] Args) {
        int z = 77;

        System.out.println("z lokal = " +z);
        System.out.println("z kelas = " +BedakanLokal.z);
    }
}
