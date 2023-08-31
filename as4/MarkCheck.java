/*Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:


Marks        Grade
91-100         AA
81-90          AB
71-80          BB
61-70          BC
51-60          CD
41-50          DD
<=40          Fail */

package com.as4;

import java.util.Scanner;

public class MarkCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your marks (out of 100): ");
        int number=in.nextInt();
        checking(number);
    }
    static void checking(int marks){
        if(marks>=91 && marks<=100){
            System.out.println("Your Grade is: AA");
        }
        if(marks>=81 && marks<=90){
            System.out.println("Your Grade is: AB");
        }
        if(marks>=71 && marks<=80){
            System.out.println("Your Grade is: BB");
        }
        if(marks>=61 && marks<=70){
            System.out.println("Your Grade is: BC");
        }
        if(marks>=51 && marks<=60){
            System.out.println("Your Grade is: CD");
        }
        if(marks>=41 && marks<=50){
            System.out.println("Your Grade is: DD");
        }
        if(marks<=40){
            System.out.println("Your Grade is: FAIL!!...Don't Worry Try Next Time.");
        }
        else {
            System.out.println("Invalid Marks enterd(you might be entered marks above 100)..");
        }
    }
}
