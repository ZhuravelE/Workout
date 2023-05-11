package com.zhuravel;

/**
 * @author Evgenii Zhuravel created on 11.05.2023
 * @version 1.0
 */
public class LinkedList {

    private Node head;
    private int count;

    public LinkedList() {
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void insert(int val) {
        this.head = new Node(val, head);
        this.count++;
    }

    public Node find(int val) {
        Node item = this.head;
        while(item != null) {
            if (item.getVal() == val) {
                return item;
            } else {
                item = item.getNext();
            }
        }

        return null;
    }

    public void deleteAt(int index) {
        if (index < this.count) {
            if (index == 0) {
                this.head = this.head.getNext();
            } else {
                int pos = 0;
                Node node = this.head;

                while(pos < index - 1) {
                    node = node.getNext();
                    pos++;
                }

                node.setNext(node.getNext().getNext());
                this.count--;
            }
        }
    }

    public void dump_list() {
        Node item = this.head;

        while(item != null) {
            System.out.println("Node: " + item.val);
            item = item.getNext();
        }
    }

    private static class Node {

        private int val;
        private Node next;

        public Node() {
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
