package com.barash.day16.linkedlist;

public class LL {
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    public void insertfirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void indexinsert(int val,int index){
        if(index==0){
            insertfirst(val);
            return;
        }
        if(index==size){
            insertlast(val);
            return;
        }
        Node  temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        //System.out.println(temp.next);
        Node node=new Node(val,temp.next);
        temp.next=node;
        size++;

    }
    public void insertlast(int val){
        if(tail==null){
            insertfirst(val);
            return;
        }
        Node node=new Node(val);
        Node temp=head;
        /*while(temp!=tail){
            temp=temp.next;
        }*/
        tail.next=node;
        tail=node;
        size++;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+"->");
            temp=temp.next;
        }
        System.out.println("end");
    }

    public int deletefirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
     public int deletelast(){
        if(size<=1){
            return deletelast();
        }
        Node secondlast=get(size-2);
        int val=tail.value;
        tail=secondlast;
        tail.next=null;
        return val;

     }
     public int deleteindex(int index){
        if(index<=1){
            return deletefirst();
        }
        if(index==size-1){
            return deletelast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;
        prev=prev.next.next;
        return val;

     }
     public Node find(int val){
        Node temp=head;
        while (temp.next!=null){
            if(temp.value==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
     }







    public Node get(int index){
        Node node=head;
        for (int i = 0; i < index; i++) {
            node=node.next;

        }
        return node;
    }



















    private class Node{
        private int value;
        private Node next;
        public Node(int value){
            this.value=value;
        }
        public Node(int value,Node next){
            this.value=value;
            this.next=next;
        }
    }
}
