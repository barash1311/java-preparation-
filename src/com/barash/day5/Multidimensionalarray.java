package com.barash.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Multidimensionalarray {
    public static void main(String[] args) {//{                                 }
        Scanner input=new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list =new ArrayList<>();
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(input.nextInt());
            }
        }
        for (int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(list.get(i));
            }
        }
    }
}
