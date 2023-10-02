//Search the index of specific number...
package com.linearSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers={45,77,23,31,99,54,97,30,53,89,-2,7,-76};
        int target=31;              //change number accordingly
        int answer=search(numbers,target);
        System.out.println(answer);
    }
    static int search(int[] numbers,int target){
        if(numbers.length==0){
            return -1;
        }

        for(int index=0;index<numbers.length;index++){
            int element=numbers[index];
            if(element==target){
                return index;
            }
        }
        //this will execute if targeted number is not in the list of array...
        return -1;
    }
}
