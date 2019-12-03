package com.exercise;

public class EkspRegular
{
    public static void main (String[] Args){
        String fiq = new String ("ada ada saja!");
        String wid = new String ("tiade duanye!");
        String mar = new String ("dari!");

        System.out.println(fiq.matches("d[aiu].+"));
        System.out.println(wid.matches(".*d[aiu].*"));
        System.out.println(mar.matches(" .+d[aiu].+"));
        System.out.println(fiq.matches(".*d[bcd].*"));
    }
}
