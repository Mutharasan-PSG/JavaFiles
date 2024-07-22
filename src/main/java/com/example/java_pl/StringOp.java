package com.example.java_pl;

import java.util.Scanner;
import java.lang.String;

public class StringOp {
      public static void StrM(String str1, Scanner scan){

          System.out.println("enter string1: ");
          str1=scan.nextLine();
         String str2 = "krish";
          System.out.println(str1+str2);

          System.out.println(str1.endsWith("h"));
          System.out.println("Do you want to continue[Y/N]: ");
          String con=scan.nextLine();
          if (con.equalsIgnoreCase("Y")) {
              StrM(str1,scan);
          }
          else{
              System.out.println("Program ends!");
          }
      }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

       String str1="";
         StrM(str1,scan);
    }

}
