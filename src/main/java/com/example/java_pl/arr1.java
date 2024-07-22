package com.example.java_pl;

import java.util.Scanner;

public class arr1 {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size = scan.nextInt();

        int[] array=new int[size];


        for(int i=0;i< array.length;i++){
            System.out.println(STR."Enter the  array num\{i}");
            array[i]= scan.nextInt();
        }

        for (int j : array) {
            System.out.println(j);
        }


    }
}
