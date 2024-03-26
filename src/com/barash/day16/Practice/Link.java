package com.barash.day16.Practice;

public class Link {
    private Node head;
    //private Node tail;
    private int size;

    public Link() {
        this.size = 0;
    }
    public void insertfirst(int val){
        Node temp=new Node(val);
        temp.next=head;
        head=temp;
       // if(tail==null){
       //     tail=head;
       // }
        size++;

    }
    public void insertlast(int val){
        Node node=new Node(val);
        if(head==null){
            insertfirst(val);
            //size++;
            return;
        }
        Node  temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        size++;

    }
    public void insert(int val,int  index){
        if (index==0){
            insertfirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;


    }
    public int deletefirst() {
        int val=head.val;
        head=head.next;
        if (head==null){
            return -1;
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
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("END");

    }
    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;
        }
        return node;
    }
    public int indexdel(int index){
        if(index==0){
            deletefirst();
        }
        if(index==size){
            deletelast();
        }
        Node pre=get(index-1);
        int val=pre.next.val;
        pre.next=pre.next.next;
        size--;
        return val;
    }







    private class Node{
        private int val;
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
