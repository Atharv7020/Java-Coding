//Keep taking numbers as inputs till the user enters 5 , after that print sum of all.
package com.as1;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter number: ");
            int number=input.nextInt();
            if(number==5){
                break;
            }

                sum+= number;

            System.out.println("Sum = "+sum);
        }


    }
}
