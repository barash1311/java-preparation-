package com.barash.day3;

import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //amstrong of a nuber sum of power of a nuber is eqaul to the number
        int start=100;
        int end=999;
        for(int i=start;i<=end;i++){
                    int originalnumber=i;
                    int n=0;
                    double result=0;
                    while(originalnumber!=0){
                        originalnumber/=10;
                        n++;
                    }
                    originalnumber=i;
                    while(originalnumber!=0){
                        int remainder=originalnumber%10;
                        result+=Math.pow(remainder,n);
                        originalnumber/=10;
                    }
                    if(result==i){
                        System.out.println(i);
                    }
                }

    }
}
