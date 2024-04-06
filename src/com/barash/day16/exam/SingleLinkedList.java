package com.barash.day16.exam;

public class SingleLinkedList {
    private Node head;
    private int size;
    private Node tail;
    public  SingleLinkedList(){
        this.size=0;
    }
    //insert at first;
    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }

        size+=1;
    }
    public void insertlast(int val){
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node node=new Node(val);
        temp.next=node;
        node=temp;
        size++;
    }

   public int deletefirst(){
        int val=head.val;
        head=head.next;
        if(head==null){
            head.next=null;
        }
        size--;
        return val;
    }
    public int deletelast(){
        if(size<=1){
            return deletefirst();
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node secondlast=get(size-2);
            int val=temp.val;
            temp=secondlast;
            temp.next=null;
            size--;
            return val;
        }

    }

    public void indexinsert(int val,int index){
        if(index==0){
            insertfirst(val);
            return;

        }if(index==size){
            insertlast(val);
            return;
        }
        Node temp=head;
        for (int i = 1; i <index ; i++) {
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"- > ");
            temp=temp.next;
        }
        System.out.print("END");
    }
    public Node get(int index){
        Node node=head;
        for (int i = 0; i <index ; i++) {
            node=node.next;
        }
        return node;
    }









    class Node{
        private int  val;
        private Node next;

        public Node(int val) {
            this.val=val;
        }
        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

}
