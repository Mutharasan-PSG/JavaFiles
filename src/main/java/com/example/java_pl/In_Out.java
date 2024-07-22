package com.example.java_pl;

import java.util.Scanner;

public class In_Out {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the input of byte: ");
        byte in0=scan.nextByte();

        System.out.println("Enter the input of int: ");
        int in1=scan.nextInt();

        System.out.println("Enter the input of float: ");
        float in2=scan.nextFloat();

        System.out.println("Enter the input of long: ");
        long in3=scan.nextLong();

        System.out.println("Enter the input of short: ");
        short in4=scan.nextShort();

        System.out.println("Enter the input of char: ");
        char in5=scan.next().charAt(0);

        System.out.println("Enter the input of string: ");
        String in6=scan.nextLine();

        System.out.println("Enter the input of Boolean: ");
        boolean in7=scan.hasNextBoolean();

        System.out.println("Enter the input of Double: ");
        double in8=scan.nextDouble();


        System.out.println(in1+in0+in2+in3+in4+in5+in6+in7);


    }
}
