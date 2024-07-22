package com.example.java_pl;

import java.util.Scanner;

public class Class {

    int func(int a , int b){

         return a+b;

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the input A: ");
        int a=scan.nextInt();

        System.out.println("Enter the input  B: ");
        int b=scan.nextInt();

        Class obj = new Class();
        int c= obj.func(a,b);

        System.out.println(c);


    }


}
