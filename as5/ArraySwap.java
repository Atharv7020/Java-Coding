//Swap the two numbers in array
package com.as5;

import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr={1,5,6,2,18};
        swap(arr,2,4);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }
}
