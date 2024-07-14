package com.zipcodewilmington.singlylinkedlist;

import org.w3c.dom.NodeList;

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

    public void add(int integer) {
        ListNode node = new ListNode(integer);
        if (this.head == null) {
            this.head = node;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
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
            count++;
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
        if(count == index){
            return current.data;
        }
        return 0;
    }

    public int find(int element){
        int count = 0;
        if (this.head == null) {
            return -1;
        }
        ListNode current = head;
        while (current.next != null) {
            if(current.data == element){
                return count;
            }
            current = current.next;
            count++;

        }
        if(current.data == element){
            return count;
        }
        return -1;
    }

    public void removeValue(int index){
        int count = 0;
        if(this.head == null){
            return;
        }
        if(index == 0){
            this.head = this.head.next;
            count--;
            return;
        }

        ListNode current = this.head;

        while(current.next != null){
            if(count+1 == index){
                current.next = current.next.next;
                count--;
                return;
            }
            current = current.next;
            count++;
        }

    }

    public SinglyLinkedList copy(){
        SinglyLinkedList newList = new SinglyLinkedList();
        int count = 0;
        if(this.head == null){
            return newList;
        }

        ListNode current = this.head;

        while(current.next != null){
            newList.add(current.data);
            current = current.next;
            count++;
        }
        return newList;
    }


    public void sort(){

        ListNode current = head, index = null;
        int temp;

        if(head == null) {
            return;
        }
        else {
            while(current != null) {
                //Node index will point to node next to current
                index = current.next;

                while(index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if(current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }

        }
    };


    public void printNodesInListnode() {
        ListNode current = this.head;
        while (current != null) {
            System.out.println(current.data + " --> ");
            current = current.next;
        }
    }
}



