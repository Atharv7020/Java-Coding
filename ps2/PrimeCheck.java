//Check whether the entered number by user is prime or not using functions.

package com.as4.ps2;

import java.util.Scanner;

public class PrimeCheck{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        System.out.println(isPrime(num));
    }
    static boolean isPrime(int number){
        if (number == 1){
            System.out.println("It is natural number!");
            return false;
        }
        for (int i=2; i<number;i++){
            if (number%i==0){
                return false;
            }

        }
        return true;
    }
}

