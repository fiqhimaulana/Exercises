package com.exercise;

public class Pangkat {
    public static void main(String[] args) {
        double x = Math.pow(5,2); //5 pangkat 2
        double y = Math.pow(x,0.5); //x pangkat 0.5
        double z = Math.pow(2,3); //2 pangkat 3
        double a = Math.pow(z, 1.0/3); // akar pangkat 3 dari z

        System.out.println("x="+x);
        System.out.println("y="+y);
        System.out.println("z="+z);
        System.out.println("a="+a);
    }
}
