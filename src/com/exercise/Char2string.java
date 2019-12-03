package com.exercise;

public class Char2string {
    public static void main (String[] Args) {

        char [] fal = new char [] {'a', 'b', 'c', 'd', 'e'};

        String fod = String.copyValueOf(fal);

        System.out.println(fod);
    }
}
