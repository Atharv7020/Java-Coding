package com.as5;

public class MaxInArr {
    public static void main(String[] args) {
        int[] arr={5,3,28,9,6};
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int maxValue = arr[0];
        for (int i=1; i<arr.length; i++){
            if (arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }
}
