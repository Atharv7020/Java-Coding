//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

package com.linearSearch;

public class EvenDigits {
    public static void main(String[] args) {
        int[] numbers ={12,345,2,6,7896};
        System.out.println(findNumbers(numbers));
    }
    static int findNumbers(int[] numbers){
        int count=0;
        for (int number:numbers){
            if (even(number)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int number){
        int numberOfDigits=digits(number);
        return numberOfDigits % 2 == 0;
    }
    static int digits(int number){
        int count=0;
        while(number>0){
            count++;
            number=number/10;
        }
        return count;
    }
}
