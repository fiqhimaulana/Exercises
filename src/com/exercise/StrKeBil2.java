package com.exercise;

public class StrKeBil2 {
    public static void main (String[] Args) {
        //String st = new String ("123.45");
        //Double bil = new Double (0);

        String st;
        double bil = 0;

        //tes 1
        st = "123.45";
        System.out.println("tes 1");
        System.out.println("Isi st =  \""+st+"\"");
        try {
            bil = Double.valueOf(st);
            System.out.println("Isi bil = " +bil);
        }
        catch (Exception a) {
            System.out.println("isi st invalid");
        }
        //test 2
        st = "    123.45    ";
        System.out.println("tes 2");
        System.out.println("Isi st = \"" +st+"\"");
        try {
            bil = Double.valueOf(st);
            System.out.println("Isi bil = " +bil);
        }
        catch (Exception a) {
            System.out.println("isi st invalid");
        }

        //tes 3
        st = "123.45abc";
        System.out.println("tes 3");
        System.out.println("Isi st = \"" +st+"\"");
        try {
            bil =  Double.valueOf(st);
            System.out.println("Isi bil");
        }
        catch (Exception a){
            System.out.println("Isi st invalid");
        }
    }
}
