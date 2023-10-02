package com.linearSearch;

public class MinimumSearch {
    public static void main(String[] args) {
        int[] arr={34,23,54,11,59,33,22,31};
        System.out.println(search(arr));
    }
    static int search(int[] arr){
        int minimum=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<minimum){
                minimum=arr[i];
            }
        }
        return minimum;
    }
}
