package com.zipcodewilmington.singlylinkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedListTest {

    @Test
    public void testLinkedList(){

        SinglyLinkedList.ListNode head = new SinglyLinkedList.ListNode(1);
        SinglyLinkedList.ListNode nodeTwo = new SinglyLinkedList.ListNode(2);
        SinglyLinkedList.ListNode nodeThree = new SinglyLinkedList.ListNode(3);
        head.next = nodeTwo;
        nodeTwo.next = nodeThree;

        Assert.assertEquals(nodeTwo, head.next);
        Assert.assertEquals(nodeThree, nodeTwo.next);
    }

    @Test
    public void testAddMethodLinkedList(){
        SinglyLinkedList sll = new SinglyLinkedList();
//        SinglyLinkedList.ListNode head = new SinglyLinkedList.ListNode(1);
//        SinglyLinkedList.ListNode nodeTwo = new SinglyLinkedList.ListNode(2);
//        SinglyLinkedList.ListNode nodeThree = new SinglyLinkedList.ListNode(3);
//        head.next = nodeTwo;
//        nodeTwo.next = nodeThree;
        sll.add(1);
        sll.add(2);
        sll.add(3);

        Assert.assertEquals(2, sll.get(1));
      //  Assert.assertEquals(nodeThree, nodeTwo.next);
    }

    @Test
    public void testContainsMethodLinkedList(){
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.add(1);
        sll.add(2);
        sll.add(3);
        boolean expected = sll.contains(56);
        boolean expected1 = sll.contains(1);


        Assert.assertEquals(false, expected);
        Assert.assertEquals(true,expected1 );
    }

    @Test
    public void testSizeMethodLinkedList(){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(1);
        sll.add(2);
        sll.add(3);
        int expected = sll.size();

        Assert.assertEquals(3, expected);
    }


    @Test
    public void testGetMethodLinkedList(){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(32);
        sll.add(234);
        sll.add(3411);
        sll.add(352);
        sll.add(5467);
        sll.add(542);
        sll.add(231);
        int expected = sll.get(4);

        Assert.assertEquals(5467, expected);
    }


    @Test
    public void testFindMethodLinkedList(){
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.add(5);
        sll.add(4);
        sll.add(34);
        sll.add(34);
        sll.add(342);
        sll.add(23);
        sll.add(435);
        int expected = sll.find(467);

        Assert.assertEquals(6, expected);
    }
    @Test
    public void testRemoveValueMethodLinkedList(){
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.add(5);
        sll.add(4);
        sll.add(34);
        sll.add(36);
        sll.add(342);
        sll.add(23);
        sll.add(435);
        sll.removeValue(5);
        Object expected = sll.get(5);

        Assert.assertEquals(435, expected);
    }

    @Test
    public void testPrintListMethodLinkedList(){
        SinglyLinkedList sll = new SinglyLinkedList();

        sll.add(5);
        sll.add(4);
        sll.add(34);
        sll.add(36);
        sll.add(342);
        sll.add(23);
        sll.add(435);
        sll.removeValue(2);
       sll.printNodesInListnode();
    }

//    copy -- returns a new linked list containing the same values (look up deep versus shallow copy)














//    sort -- sorts the list using your algorithm of choice.
//    You must perform the sorting yourself (no fair using someone else's library)












}
