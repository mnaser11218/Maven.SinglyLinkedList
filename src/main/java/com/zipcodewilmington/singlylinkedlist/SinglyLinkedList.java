package com.zipcodewilmington.singlylinkedlist;

import java.util.List;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    public ListNode head;

    public static class ListNode {
        public int data; // generic type
        public ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }


    }

    public void add(ListNode singleNode) {
        if (this.head == null) {
            this.head = singleNode;
            return;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = singleNode;
    }

    public boolean contains(int num) {
        if (this.head == null) {
            return false;
        }
        ListNode current = head;
        while (current.next != null) {
            if (current.data == num) {
                System.out.println("true");
                return true;
            }
            current = current.next;
        }
        if (current.data == num) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }

    public int size() {
        int count = 0;
        if (this.head == null) {
            return count;
        }
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
            count++;
        }
        count++;
        return count;
    }

    public int get(int index){
        if(index >= this.size()){
            throw new ArrayIndexOutOfBoundsException();
        }
        int count = 0;
        if (this.head == null) {
            return count;
        }
        ListNode current = head;
        while (current.next != null) {
            if(count == index){
                return current.data;
            }
            current = current.next;
            count++;

        }
      //  count++;
        if(count == index){
            return current.data;
        }
        return 99;
    }


    public void printNodesInListnode(SinglyLinkedList sll) {
        ListNode current = sll.head;
        while (current != null) {
            System.out.println(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }
}


//    public static void main(String[] args) {
//        SinglyLinkedList sll = new SinglyLinkedList();
////        sll.head = new ListNode(10);
////        ListNode second = new ListNode(20);
////        ListNode third = new ListNode(30);
//        ListNode addedNode = new ListNode(10);
//        ListNode addedNode2 = new ListNode(15);
//        sll.add(addedNode);
//        sll.add(addedNode2);
//        ListNode secondAddedNode = new ListNode(20);
//        sll.add(secondAddedNode);
//        ListNode thirdAddedNode = new ListNode(30);
//        sll.add(thirdAddedNode);
//
//
//        sll.printNodesInListnode(sll);
//        sll.contains(30);
//        System.out.println(sll.size());
//
////
////        sll.head.next = second;
////        second.next = third;
//
//
//
//
//
//
//
//    }



