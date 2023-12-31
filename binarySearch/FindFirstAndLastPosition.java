// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

package com.binarySearch;

import java.util.Arrays;

public class FindFirstAndLastPosition {
    public static void main(String[] args){
        int[] nums = {5,7,7,7,7,8,8,10};
        int target=7;

        int[] Answer=(searchRange(nums,target));
        System.out.println(Arrays.toString(Answer));
    }
    static int[] searchRange(int[] nums,int target){
        int[] ans={-1,-1};

        int start = searchIndex(nums,target,true);
        int last = searchIndex(nums,target,false);

        ans[0]=start;
        ans[1]=last;

        return ans;
    }

    static int searchIndex(int[] nums,int target,boolean firstIndex){
        int ans = -1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end - start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if (firstIndex){
                    end = mid - 1;
                }
                else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }

}
