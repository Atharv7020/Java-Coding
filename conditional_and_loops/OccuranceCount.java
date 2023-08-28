//Find out how many times same number occurred in given variable.
package com.conditional_and_loops;

public class OccuranceCount {
    public static void main(String[] args) {
        int a= 878908;
        int count=0;

        while(a>0){
            int remender=a%10;

            if (remender==8)
            {
                count++;
            }
            a=a/10;
        }
        System.out.println("Number Occurred "+count+" times. ");
    }
}
