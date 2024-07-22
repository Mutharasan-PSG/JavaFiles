package com.example.java_pl;

import java.util.Scanner;

public class Func {
    private String name;
    private   int age;
    private   float weight;
    private double bank_balance;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){


        return age;

    }

    public void setAge(int age){
        this.age=age;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setBank_balance(double bank_balance) {
        this.bank_balance = bank_balance;
    }

    public float getWeight() {
        return weight;
    }

    public double getBank_balance() {
        return bank_balance;
    }

    public String methodF(){

        return name+age+weight+bank_balance;

    }




    public static void main(String[] args){

        Func object=new Func();
        Func obj2=new Func();

        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your name: ");
        object.setName(scan.nextLine());

        System.out.println("Enter your age: ");
        obj2.setAge(scan.nextInt());

        System.out.println("Enter your weight: ");
        object.setWeight(scan.nextFloat());

        System.out.println("Enter your bank_balance: ");
        obj2.setBank_balance(scan.nextDouble());

        String DetailsOfPerson= object.methodF();

        System.out.println(DetailsOfPerson);

    }

}
