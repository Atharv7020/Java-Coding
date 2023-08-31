package com.as4.ps1;

import java.util.Scanner;

public class CheckArmstrong {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number=in.nextInt();
        boolean ans=isArmstrong(number);
        System.out.println(ans);
    }
    static boolean isArmstrong(int num){
        int original=num;
        int sum=0;
        while(num>0){
            int remender=num%10;
            sum=sum+(remender*remender*remender);
            num=num/10;
        }
        if (sum==original){
            return true;
        }
            return false;
    }
}
