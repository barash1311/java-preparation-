package com.barash.day6;

public class FINDING_EVEN_NO_OF_DIGIT {
    public static void main(String[] args) {
        int[] arr={12,2,3,6778,6543,0,122};
        int count=evencheck(arr);
        System.out.println(count);

    }
    public static int evencheck(int[] arr){
        //{12,2,3,6778} 2
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(even(arr[i])){
                count++;
            }
        }
        return count;


    }
    public static boolean even(int num){
        int rev=0;
        while(num!=0){
            int temp=num%10;
            rev++;
            num/=10;
        }
        if(rev%2==0){
            return true;

        }
        else{
            return false;
        }
    }

}
