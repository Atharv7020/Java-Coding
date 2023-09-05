//Write a program to print the factorial of a number by defining a method named 'Factorial'. Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
package com.as4.ps2;

import java.util.Scanner;

public class FactorialWithFun {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=in.nextInt();
        System.out.println("Factorial of entered number is: "+factorial(num));
    }
    static int factorial(int num){
        int fact=1;
        for (int i= 1; i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
}
