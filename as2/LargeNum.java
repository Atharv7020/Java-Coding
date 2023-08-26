//Take 2 numbers as input and print the largest number.
package com.as2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LargeNum {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter one number: ");
        int num1=input.nextInt();
        System.out.println("Enter another number: ");
        int num2=input.nextInt();
        if(num1>num2){
            System.out.println("Largest Number: "+num1);
        }
        else if(num2>num1){
            System.out.println("Largest Number: "+num2);
        }
        else if (num1==num2){
            System.out.println("Error!");
        }

    }
}
