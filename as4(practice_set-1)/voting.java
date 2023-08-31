// A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.
package com.as4.ps1;

import java.util.Scanner;

public class voting {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your age to check if you're eligible to vote: ");
        int number=in.nextInt();
        System.out.println(isEligible(number));
    }
    static boolean isEligible(int age){
        if(age>=18){
            return true;
        }
        return false;
    }
}
