package com.barash.day11;

public class linear {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        System.out.println(search(arr,9,0));
    }
    public static boolean search(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);
    }
}
