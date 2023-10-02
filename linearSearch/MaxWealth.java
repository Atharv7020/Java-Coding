//https://leetcode.com/problems/richest-customer-wealth/
package com.linearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts={
            {2,8,7},
            {7,9,3},
            {1,9,5}
        };
        System.out.println(maximumWealth(accounts));
    }
    static int maximumWealth(int[][] accounts){
        int answer=Integer.MIN_VALUE;
        for (int person=0;person<accounts.length;person++){
            int rowSum=0;
            for (int account=0;account<accounts[person].length;account++){
                rowSum=rowSum+accounts[person][account];
            }
            if(rowSum>answer){
                answer=rowSum;
            }
        }
        return answer;
    }
}
