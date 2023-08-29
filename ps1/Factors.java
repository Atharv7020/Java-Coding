//Input a number and print all the factors of that number (use loops).

package com.as3.ps1;

import java.util.Scanner;


public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = in.nextInt();

        System.out.println("Factors of " + number + ":");

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }


    }
}






