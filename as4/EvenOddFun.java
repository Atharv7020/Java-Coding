// Define a program to find out whether a given number is even or odd.
package com.as4;

import java.util.Scanner;

public class EvenOddFun {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=in.nextInt();
        evenorodd(num);
    }
    static void evenorodd(int number){
        if(number%2==0){
            System.out.println("Number is EVEN!...");
        }
        else{
            System.out.println("Number id ODD!...");
        }
    }
}
