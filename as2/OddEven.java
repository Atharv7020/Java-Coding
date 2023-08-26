//Write a program to print whether a number is even or odd, also take input from the user.
package com.as2;

import java.util.Scanner;

public class OddEven {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number= input.nextInt();
        if(number%2==0){
            System.out.println("The number is EVEN!");
        }
        else{
            System.out.println("The number is ODD!");
        }
    }
}
