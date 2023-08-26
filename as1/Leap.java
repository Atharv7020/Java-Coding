package com.as1;

import java.util.Scanner;

public class Leap{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the yeat to check:");
        int year=input.nextInt();

        if (year%4==0){
            System.out.println("Entered Year is leap year.");
        }
        else{
            System.out.println("Entered year is not leap year.");
        }
    }
}
