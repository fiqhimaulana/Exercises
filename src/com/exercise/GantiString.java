package com.exercise;

public class GantiString
{
    public static void main (String [] Args)
    {
        String wid = new String("kukuku kaku kaku!");

        System.out.println(wid.replaceFirst("k[ua]", "bi"));
        System.out.println(wid.replaceAll("k[ua]", "bi"));
        System.out.println(wid.replaceAll("uk", ""));

    }
}