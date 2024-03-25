package com.barash.day16.CustomQ;

import com.barash.day16.StackImplementation.Exceptiomss;

public class Cque   {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;
    public Cque(){
        this(DEFAULT_SIZE);
    }
    public Cque(int size){
        this.data=new int[size];
    }
    public boolean insert(int n){
        if(isfull()){
            System.out.println("que is full");
            return false;
        }

        data[end++]=n;
        return true;

    }
    public int remove () throws Exception{
        if(isempty()){
            throw new Exception("QUUE IS EMPTY");
        }
        int remve=data[0];
        for (int i = 1; i < end; i++) {
            data[i-1]=data[i];
        }
        end--;
        return remve;
    }
    public  int front() throws Exception{
        if(isempty()){
            throw new Exception("QUUE IS EMPTY");
        }
        return data[0];

    }
    public void display(){
        for (int i = 0; i < end; i++) {
            System.out.println(data[i]+" ");

        }
        System.out.println("END");
    }







    public boolean isfull(){
        return end==data.length;
    }
    public boolean isempty(){
        return end==0;
    }
}
