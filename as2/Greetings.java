//Take name as input and print a greeting message for that particular name.
package com.as2;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Tell Me Your Name: ");
        String name=input.next();
        System.out.println("Hello "+name+ " ,have a good day!");
    }
}
