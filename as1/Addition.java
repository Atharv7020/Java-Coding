// Take two numbers and print the sum of both.
package com.as1;

import java.util.Scanner;

public class Addition {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a=input.nextInt();
        System.out.println("Enter the second number: ");
        int b=input.nextInt();
        int c=a+b;
        System.out.println("The addition of two numbers is: "+ c);
        System.out.println("The additoin of "+a+ " and "+b+" is: "+c);
    }
}
