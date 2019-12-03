package com.exercise;

public class Subst
{
    public static void main(String[] Args)
    {
        String wid = new String("ABCDEFGHIJKLM");

        System.out.println("\""+wid+"\" .substring(0,1) :" +wid.substring(0,1));
        System.out.println("\""+wid+"\" .substring(0,3) :" +wid.substring(0,3));
        System.out.println("\""+wid+"\" .substring(2,3) :" +wid.substring(2,3));
        System.out.println("\""+wid+"\" .substring(2) :" +wid.substring(2));
    }
}
