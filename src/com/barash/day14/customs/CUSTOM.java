package com.barash.day14.customs;

import java.util.Arrays;

public class CUSTOM {
    private int[] data;
    final private int default_size=11;
    private int initial_size=0;

    public CUSTOM() {
        this.data = new int[default_size];
    }
    void add(int num){
        if(isfull()){
            resize();
        }
        data[initial_size++]=num;
    }
    private  boolean isfull(){
        return initial_size==default_size;
    }
    private void  resize(){
        int[] temp=new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;

    }
    public void remove(){
        int remvoed=data[initial_size--];

    }

    @Override
    public String toString() {
        return "CUSTOM{" +
                "data=" + Arrays.toString(data) +
                ", default_size=" + default_size +
                ", initial_size=" + initial_size +
                '}';
    }

    public static void main(String[] args) {
        CUSTOM c1=new CUSTOM();
        for (int i = 0; i < 20; i++) {
            c1.add(i);

        }
        System.out.println(c1.toString());
    }
}
