//Write a function to check if a given triplet is a Pythagorean triplet or not. (A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
package com.as4.ps2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first two numbers: ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println("Enter Third Number: ");
        int num3=in.nextInt();
        System.out.println(isPythagoras(num1,num2,num3));
    }

    static boolean isPythagoras(int number1,int number2,int number3){
        int checkSquare1=(number1*number1)+(number2*number2);
        int checkSquare2=number3*number3;

        if (checkSquare1 == checkSquare2){
            return true;
        }
        return false;
    }
}
