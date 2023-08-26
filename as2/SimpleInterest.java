package com.as2;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the principal: ");
        int p=input.nextInt();
        System.out.println("Enter the time(in years): ");
        float t=input.nextFloat();
        System.out.println("Enter the Rate(%): ");
        float r= input.nextFloat();
        double si= (p*r*t)/100;
        System.out.println("The SIMPLE INTEREST is: "+si);

    }
}
