//Take 3 numbers from users and find which one is the largest.

package com.conditional_and_loops;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int num3=in.nextInt();

        int max=num1;
        if (num2>max){
            max=num2;
        }
        if(num3>num2 && num3>num1){
            max=num3;
        }
        System.out.println("Largest Number is: "+ max);
    }
}
