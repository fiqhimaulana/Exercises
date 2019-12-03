package com.exercise;

public class Bandingkan {
    public static void main(String[] args) {
        String s1 = new String("Java");
        String s2 = new String("Jawa");
        String s3 = new String("Sumatera");

        System.out.println("\""+s1+"\".compareTo(\""+s2+"\") :"  +s1.compareTo(s2));

        System.out.println("\""+s1+"\".compareTo(\""+s3+"\") :"+s1.compareToIgnoreCase(s3)); // tidak peduli kapital

        System.out.println("\""+s3+"\".compareTo(\""+s3+"\") :" +s3.compareTo(s3));

        System.out.println("\""+s1+"\"samakah? (\""+s2+"\") :" + s1.equals(s2)) ;

        System.out.println("\""+s3+"\" samakah? (\""+s3+"\") :"+s3.equalsIgnoreCase(s3));
    }
}