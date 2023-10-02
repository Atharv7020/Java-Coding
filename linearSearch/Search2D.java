package com.linearSearch;

import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int[][] arr={
                     {2,3,76,33},
                     {99,43,64,21},
                     {23,54,76},
                     {29,43}
                    };
        int target=64;
        int[] ans=search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int target){
        for (int row=0; row< arr.length; row++){
            for (int col=0; col< arr[row].length; col++){
                if (arr[row][col]==target){
                    return new int[] {row,col};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
