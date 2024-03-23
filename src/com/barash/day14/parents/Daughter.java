package com.barash.day14.parents;

public class Daughter  extends Parent{

    Daughter(){
        super();
    }
    @Override
    void career(){
        System.out.println("i wanrt to be an engineer");
    }

    @Override
    void partner() {
        System.out.println("i love iron man");
    }
}
