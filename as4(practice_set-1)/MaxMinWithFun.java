//Define two methods to print the maximum and the minimum number respectively among three numbers entered by the user.
package com.as4.ps1;

import java.util.Scanner;

public class MaxMinWithFun {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();

            Maximum(a,b,c);
            Minimum(a, b, c);
    }

    static void Maximum(int A,int B,int C){
        int max=A;
        if (B>max){
            max=B;
        }
        if (C>max){
            max=C;
        }
        System.out.println("The Maximum number out of 3 is: "+max);
    }
    static void Minimum(int p,int q,int r){
        int min=p;
        if (q<min){
            min=q;
        }
        if (r<min){
            min=r;
        }
        System.out.println("The Minimum number out of 3 is: "+min);
    }
}

