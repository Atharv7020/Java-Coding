//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
package com.as2;

import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number1=input.nextInt();
        System.out.println("Enter the operator: ");
        String operator=input.next();
        System.out.println("Enter another number: ");
        int number2=input.nextInt();
        if (operator.equals("+")){
            int addition=number1+number2;
            System.out.println("Addition of two numbers are: "+addition);
        }
        else if (operator.equals("-")){
            int sub=number1-number2;
            System.out.println("Substraction of two numbers are: "+sub);
        }
        else if (operator.equals("*")){
            int multi=number1*number2;
            System.out.println("Multiplication of two numbers are: "+multi);
        }
        else if (operator.equals("/")){
            int division=number1/number2;
            System.out.println("Division of two numbers are: "+division);
        }
        else {
            System.out.println("Invalid operator!");
        }
    }
}
