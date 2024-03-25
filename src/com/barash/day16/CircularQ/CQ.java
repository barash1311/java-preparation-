package com.barash.day16.CircularQ;

public class CQ {
    private int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0;
    int front=0;
    private int size=0;
    public CQ(){
        this(DEFAULT_SIZE);
    }
    public CQ(int size){
        this.data=new int[size];
    }
    public boolean isfull(){
        return size==data.length;
    }
    public boolean isempty(){
        return end==0;
    }
    public boolean insert(int n){
        if(isfull()){
            System.out.println("que is full");
            return false;
        }

        data[end++]=n;
        end=end%data.length;
        size++;
        return true;

    }
    public int remove () throws Exception{
        if(isempty()){
            throw new Exception("QUUE IS EMPTY");
        }
        int remve=data[front++];

        front=front%data.length;
        size--;
        return remve;
    }
    public void display(){
        for (int i = front; i < end; i++) {
            System.out.println(data[i]+" ");

        }
        System.out.println("END");
    }
}
