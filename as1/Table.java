//Take a number as input and print the multiplication table for it.

package com.as1;

import java.util.Scanner;

public class Table {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int Number=input.nextInt();
        for(int j=1;j<=10;j++){
            System.out.println("The Table of the Number " +Number+ " is: "+Number+"* "+j+" = "+Number*j);
        }
    }
}
