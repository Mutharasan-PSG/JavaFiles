package com.example.java_pl;

import java.util.Arrays;
import java.util.Scanner;

public class sort {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter the size: ");
        int size= scan.nextInt();
        int[] arr=new int[size];

        for(int i=0;i<size;i++){
            System.out.println("Enter the array"+i);
            arr[i]= scan.nextInt();
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
