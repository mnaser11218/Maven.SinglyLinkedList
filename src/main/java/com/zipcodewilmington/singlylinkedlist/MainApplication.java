package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {


    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
//        sll.head = new ListNode(10);
//        ListNode second = new ListNode(20);
//        ListNode third = new ListNode(30);
        SinglyLinkedList.ListNode addedNode = new SinglyLinkedList.ListNode(10);
        SinglyLinkedList.ListNode addedNode2 = new SinglyLinkedList.ListNode(15);
        sll.add(addedNode);
        sll.add(addedNode2);
        SinglyLinkedList.ListNode secondAddedNode = new SinglyLinkedList.ListNode(20);
        sll.add(secondAddedNode);
        SinglyLinkedList.ListNode thirdAddedNode = new SinglyLinkedList.ListNode(30);
        sll.add(thirdAddedNode);


        sll.printNodesInListnode(sll);
        sll.contains(30);
        System.out.println(sll.size());

//
//        sll.head.next = second;
//        second.next = third;







    }
}
