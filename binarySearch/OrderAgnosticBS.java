package com.binarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args){
        int[] arr = {99,78,54,32,23,11};
        int target=78;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAsc;
        isAsc= arr[start] < arr[end];

        while(start<=end){
            int mid = start+end /2;
            if (arr[mid]==target){
                return mid;
            }
            if(isAsc){
                if(target<arr[mid]){
                    end=mid-1;
                }
                else if (target>arr[mid]) {
                    start=mid+1;
                }

                }
            else {
                if(target>arr[mid]){
                    end=mid-1;
                }
                else if (target<arr[mid]) {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
