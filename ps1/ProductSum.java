//Subtract the Product and Sum of Digits of an Integer.

package com.as3.ps1;

import java.util.Scanner;

public class ProductSum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two integers: ");
        int a =in.nextInt();
        int b=in.nextInt();
        int answer=(a*b)-(a+b);
        System.out.println(answer);
    }
}
