package com.exercise;

public class JumlahKar {
    public static void main(String[] args) {
        String st;

        st = "";
        System.out.println("Jumlah karakter \"" + st + "\" = " + st.isEmpty());

        String cob = new String ("Tes 123");
        System.out.println("\"Jumlah karakter\" \""+cob+"\" = " +cob.isEmpty());

        String wid = new String ("bahasa java");
        System.out.println("Jumlah karakter \"" + wid + "\" = " +wid.length());


    }
}