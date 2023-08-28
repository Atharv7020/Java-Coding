//Take a number from user and try to reverse it.

package com.conditional_and_loops;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=in.nextInt();
        int answer=0;

        while(number>0){
            int remender=number%10;
            answer=answer*10+remender;
            number=number/10;
        }
        System.out.println("Reversed Number is: "+answer);
    }
}
