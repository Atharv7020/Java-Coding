//Make calculator program

package com.conditional_and_loops;

import java.net.CookiePolicy;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int ans=0;
        while (true) {
            System.out.println("Enter operator: ");
            char operator=in.next().trim().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                System.out.println("Enter first number: ");
                int num1=in.nextInt();
                System.out.println("Enter second number: ");
                int num2=in.nextInt();

                if (operator=='+'){
                  ans=num1+num2;
                }
                if (operator=='-'){
                    ans=num1-num2;
                }
                if (operator=='*'){
                    ans=num1*num2;
                }
                if (operator=='/'){
                    ans=num1/num2;
                }
            }
            else if(operator=='x' || operator=='X') {
                break;
            }
            else{
                System.out.println("invalid operation!");
            }
            System.out.println(ans);
        }

    }
}
