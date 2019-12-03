package com.exercise;

public class StrSama {
    public static void main (String [] Args) {
        String st1 = new String ("Tes...tes...123");
        String st2 = new String ("Tes...Tes...123");
        String st3 = new String (st1);

        //tes 1
        System.out.print("\""+st1+"\" dan \"" +st2+"\" : ");
        if (st1 == st2) {
            System.out.println("sama");
        }
        else {
            System.out.println("tidak sama");
        }

        //tes 2
        System.out.print("\""+st1+"\" dan \""+st3+"\" :");
        if (st1.equals(st3)) {              //  Sensitif Case
            System.out.println ("Sama");
        }
        else {
            System.out.println("TIdak Sama");
        }

        //tes 3
        System.out.print("\""+st1+"\" dan \""+st2+"\" : ");
        if (st1.equalsIgnoreCase(st2)) {     // Ignore Capital
            System.out.println("sama");
        }
        else {
            System.out.println("tidak sama");
        }
    }
}
