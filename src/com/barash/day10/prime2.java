package com.barash.day10;

public class prime2 {
    public static void main(String[] args) {
        int n=100;
        boolean[] arr=new boolean[n+1];
        seive(n,arr);

    }
    public static void seive(int n,boolean[] arr){
        for(int i=2;i<=Math.sqrt(n);i++){
            if(!arr[i]){
                for(int j=i*2;j<=n;j+=i){
                    arr[j]=true;
                }
            }
        }
        for (int i = 2; i <n; i++) {
            if(!arr[i]){
                System.out.print(i+" ");
            }
            
        }
    }
}
