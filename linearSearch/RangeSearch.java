package com.linearSearch;

public class RangeSearch {
    public static void main(String[] args) {
        int[] arr={12,15,89,24,0,44,76};
        int target=76;
        System.out.println(search(arr,target,1,4));
    }
    static int search(int[] arr,int target,int start,int end){
        if (arr.length==0){
            return -1;
        }
        for (int index = start; index <= end ; index++) {
            int element=arr[index];
            if (element == target){
                return index;
            }
        }
        return -1;
    }
}
