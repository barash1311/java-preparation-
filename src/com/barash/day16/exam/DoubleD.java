package com.barash.day16.exam;

public class DoubleD {
    private Node head;
    class Node{
        private int val;
        private Node next;
        private Node prev;

        public Node(int val) {
            this.val=val;
        }
        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }

        public void insertfirstdouble(int val){
            Node node=new Node(val);
            node.next=head;
            node.prev=null;
            if(head!=null){
                head.prev=node;
             }

        }
    }
}
