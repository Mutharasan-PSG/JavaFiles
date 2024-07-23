package com.example.java_pl;

import java.util.HashMap;
import java.util.Scanner;
 public class Hash_Map {

  static void hash(HashMap<Integer, Integer> map, int size){

      Object[] keys=map.keySet().toArray();

      for(int i=0;i<size;i++){
          Integer key=(Integer) keys[i];

          Integer value=map.get(key);
          System.out.println(key+","+value);
      }

    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        HashMap<Integer, Integer> map = new HashMap<>();

        int size=4;
        for(int i=0;i<size;i++){
            System.out.println("Enter the key: ");
            int key=input.nextInt();

            System.out.println("Enter the value: ");
            int value= input.nextInt();
            map.put(key,value);
        }

         hash(map,size);
    }

}
