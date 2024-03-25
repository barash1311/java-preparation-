package com.barash.day16.StackImplementation;

public class CustomStack {
    protected int[] data;
    private static final  int DEFAULT_SIZE=10;
    int ptr=-1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }

    public boolean push(int n){
        if(isfull()){
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=n;
        return true;

    }
    public int peak() throws Exceptiomss{
        if(isempty()){
            throw  new Exceptiomss("stack  peak is empty");
        }
        return data[ptr];
    }
    public int pop() throws Exceptiomss{
        if(isempty()){
            throw  new Exceptiomss("stack is empty");
        }
        int removed=data[ptr];
        ptr--;
        return removed;


    }

    public boolean isfull(){
         return ptr==data.length-1;
    }
    public boolean isempty(){
        return ptr==-1;
    }

}
