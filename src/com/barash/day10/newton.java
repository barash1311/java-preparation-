package com.barash.day10;

public class newton {
    public static void main(String[] args) {
        System.out.println(net(50));

    }
    public static double net(double n){
        double x=n;
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        return  root;
    }
}
