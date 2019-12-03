package com.exercise;

public class ContohBreak2 {
    public static void main(String[] Args) {
        int i = 1;

        while (i <= 5) {
            System.out.print(i + ":");

            int j = 1;
            while (j <= 5) {
                System.out.print(j + " ");

                if (j == i) break;
                j++;
            }
            i++;
            System.out.println();

        }
    }
}
