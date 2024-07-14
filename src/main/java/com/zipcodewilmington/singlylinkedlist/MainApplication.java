package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.add(10);
        sll.add(15);
//        SinglyLinkedList.ListNode secondAddedNode = new SinglyLinkedList.ListNode(20);
        sll.add(20);
//        SinglyLinkedList.ListNode thirdAddedNode = new SinglyLinkedList.ListNode(30);
        sll.add(30);


        sll.printNodesInListnode();
        sll.contains(30);
        System.out.println(sll.size());


    }
}
