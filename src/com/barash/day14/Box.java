package com.barash.day14;

public class Box {
    public double getL() {
        return l;
    }

    public double getH() {
        return h;
    }

    public double getW() {
        return w;
    }

    double l;
    double h;
    double w;
    Box(){
        this.l=-1;
        this.h=-1;
        this.w=-1;
    }
    Box(double side){
        this.l=side;
        this.h=side;
        this.w=side;
    }
    Box(double l,double h,double w){
        this.l=l;
        this.w=w;
        this.h=h;
    }
    Box(Box old){
        this.l=old.l;
        this.h=old.h;
        this.w=old.w;
    }
     void display(){
        System.out.println(this.l);
         System.out.println(this.h);
         System.out.println(this.w);
         System.out.println();
    }

}
