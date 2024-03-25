package com.barash.day16.StackImplementation;

public class DynamicStack extends CustomStack{
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int n) {
        if(this.isfull()){
            int[] temp=new int[data.length*20];
            for (int i = 0; i < data.length; i++) {
                temp[i]=data[i];
            }
            data=temp;

        }
        return super.push(n);
    }
}
