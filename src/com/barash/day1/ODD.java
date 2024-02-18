package com.barash.day1;
import java.util.Scanner;
public class ODD {
    public static  void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.print("enter the number you want to check:");
        int in =input.nextInt();
        if(in%2==0){
            System.out.print("entered no is even");
        }
        else{
            System.out.print("enterd no  is odd");
        }

    }
}
