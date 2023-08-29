//Take integer inputs till the user enters 0 and print the largest number from all.

package com.as3.ps1;

import java.util.Scanner;

public class LargestViaInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int largestNumber = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter an integer (enter 0 to stop): ");
            int num = in.nextInt();

            if (num == 0) {
                break;
            }

            if (num > largestNumber) {
                largestNumber = num;
            }
        }

        if (largestNumber == Integer.MIN_VALUE) {
            System.out.println("No numbers were entered.");
        } else {
            System.out.println("The largest number entered is: " + largestNumber);
        }


    }
}
