// Define a method that returns the product of two numbers entered by user.
package com.as4.ps1;

import java.util.Scanner;

public class ReturnProduct {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1= in.nextInt();
        int num2=in.nextInt();
        System.out.print("Product of two numbers is: "+product(num1,num2));
    }
    static int product(int number1,int number2){
        int ans=number1*number2;
        return ans;
    }
}
