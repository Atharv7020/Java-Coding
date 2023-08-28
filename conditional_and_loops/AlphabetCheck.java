//Take a word as input from user and check whether it is uppercase or lowercase.

package com.conditional_and_loops;

import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the word: ");
        char name=in.next().trim().charAt(0);

        if(name>='a' && name<='z') {
            System.out.println("Lowercase!");
        }

        else{
                System.out.println("Uppercase");
            }

        }
    }

