package com.barash.day8;

public class Pattern5 {
    public static void main(String[] args) {
        pattern5(5);

    }
    public static void pattern5(int n){
        for(int i=1;i<=2*n-1;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
            /*for(int j=(2*n-1)/2;j<i;j++){
                System.out.print("* ");
            }
            System.out.println();*/
        }
    }

}
