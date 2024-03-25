package com.barash.day16.DoubleList;

import com.barash.day16.linkedlist.LL;

public class DD {
    private Node head;
    private Node tail;
    private int size=0;
    public  void insertfirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.previous = null;
        if (head != null) {
            head.previous = node;
        }
        head=node;
    }

    public void insertlast(int val){
        Node node=new Node(val);
        Node last=head;
        node.next=null;
        if(head==null){
            head=node;
            head.previous=null;
        }
        while(last.next!=null){
            last=last.next;
        }

        last.next=node;
        node.previous=last;


    }
    public Node find(int val){
        Node temp=head;
        while(temp!=null){
            if(temp.val==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void insertafter(int after ,int val){
        Node p=find(after);
        if(p==null){
            System.out.println("does not exit");
            return;
        }
        Node node=new Node(val);
        node.next=p.next;
        node.previous=p;
        p.next=node;
        if(node.next!=null) {
            node.next.previous = node;
        }

    }












    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.print("end");
    }
    public void displayrev(){
        Node temp=head;
        Node last=null;
        while(temp!=null){
            System.out.print(temp.val+"->");
            last=temp;
            temp=temp.next;
        }
        System.out.print("end");
        System.out.println();
        while (last!=null){
            System.out.print(last.val+"->");
            last=last.previous;

        }
    }

    class Node{
        int val;
        Node next;
        Node previous;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node previous) {
            this.val = val;
            this.next = next;
            this.previous = previous;
        }
    }
}
