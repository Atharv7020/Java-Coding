package com.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {7,2,5,1,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        boolean swapped;
        for (int i = 0;i<arr.length;i++){
            swapped = false;
            for(int j=1;j<arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped = true;
                }

            }
            if (!swapped) break;
        }
    }
}
