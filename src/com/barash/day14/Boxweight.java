package com.barash.day14;
//base class Box and sub class box weith
public class Boxweight  extends Box{
    double weight;
    public Boxweight(){
        this.weight=-1;
    }
    public Boxweight(double l,double h,double  w,double weight){
        super(l,h,w);

        this.weight=weight;
    }
    Boxweight(Boxweight B1){
        super(B1);
        weight=this.h;
    }

    void display(){
        //Box temp=new Box();
        //temp.display();
        // display();
        System.out.print(this.weight);
    }

}
