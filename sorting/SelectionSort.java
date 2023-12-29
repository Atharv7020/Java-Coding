package com.sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,6,3,1,7,8};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr){
        for (int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int maxIndex=getMax(arr, last);
            swap(arr,maxIndex,last);
        }
    }
    static void swap(int[] arr,int maxIndex,int last){
        int temp = arr[maxIndex];
        arr[maxIndex]=arr[last];
        arr[last]=temp;
    }
    static int getMax(int[] arr, int end){
        int max = 0;
        for (int i = 0; i<=end; i++){
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
