// Sum Of digits in given number.
package com.as3.ps2;

public class SumOfDigits {
    public static void main(String[] args) {
        int a=76485;
        int ans=0;
        while(a>0){
            int rem=a%10;
            ans=ans+rem;
            a=a/10;
        }
        System.out.println(ans);
    }
}
