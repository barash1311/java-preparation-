package com.barash.day10;

public class count {
    public static void main(String[] args) {
        int num=569867;//1001
        System.out.println(Integer.toBinaryString(num));
       /* int count=0;
        while(num>0){
            if((num & 1)==1){
                count++;
            }
            num=num>>1;
        }
        System.out.println(count);*/
        System.out.println(get(num));
    }
    public static int get(int n){
        int count=0;
        while(n>0){
            count++;
            n=n-(n&-n);
        }
        return count;
    }
}
