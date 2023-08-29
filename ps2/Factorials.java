//Take number as an input find the factorial of that number.
package com.as3.ps2;

import java.util.Scanner;

public class Factorials {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int number=in.nextInt();
        if(number<0){
            System.out.println("Invalid! You won't get an factorial of negative numbers.");
        }
        int factorial=1;
        for(int i=1; i<=number; i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
