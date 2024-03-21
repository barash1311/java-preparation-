package com.barash.day14;

public class CLASS1 {
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student(2,"barash",23.4f);
        student s3=new student();
        s2.dsiplay();
        System.out.println();
        s3.dsiplay();
        Integer num=45;
        int A=45;
        A obj;
        for (int i = 0; i < 1000000; i++) {
            obj=new A();

        }



    }
}
 class student{
    int rno;
    String name;
    float marks=55;
    student(){
        this(0,"default",0.0f);
    }
    student(int rno,String name,float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
    }
    student(student temp){
        this.rno=temp.rno;
        this.name=temp.name;
        this.marks=temp.marks;
    }

    void dsiplay(){
        System.out.println(this.rno);
        System.out.println(this.name);
        System.out.println(this.marks);
    }

}
class A{
    final int a=10;


    @Override
    protected void finalize() throws Throwable {
        System.out.println("destroyed");
    }
}
