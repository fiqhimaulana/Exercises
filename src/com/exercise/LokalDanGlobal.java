package com.exercise;

public class LokalDanGlobal {
    static int z = 99;

    public static void main(String[] Args) {
        int x = 77; //Lokal

        System.out.println("Di main() :");
        System.out.println("x :" +x);
        System.out.println("z :" +z);

        System.out.println("Di info() : ");
        info();

        System.out.println("Di main() : ");
        System.out.println("x : " +x);
        System.out.println("z : " +z);
    }

    private static void info() {
        int x = 88;

        System.out.println("x : " +x);
        System.out.println("z : " +z);
    }
}
