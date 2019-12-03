package com.exercise;

public class ContohContinue {
    public static void main(String[] Args) {
        int i = 0;
        while (i < 5) {

            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("----------------");

        for (i = 0; i < 5; i++) {
            if (i == 3) continue;
        System.out.println(i);
        }
    }
}
