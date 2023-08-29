//Java Program Vowel Or Consonant.

package com.as3.ps2;

import java.util.Scanner;

public class VowelOrConso {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch=in.next().trim().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' ||  ch== 'o' || ch=='u'){
            System.out.println("It is Vowel!");
        }
        else{
            System.out.println("It is CONSONANT!");
        }
    }
}
