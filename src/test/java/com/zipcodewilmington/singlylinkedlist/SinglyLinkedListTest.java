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
        SinglyLinkedList.ListNode head = new SinglyLinkedList.ListNode(1);
        SinglyLinkedList.ListNode nodeTwo = new SinglyLinkedList.ListNode(2);
        SinglyLinkedList.ListNode nodeThree = new SinglyLinkedList.ListNode(3);
//        head.next = nodeTwo;
//        nodeTwo.next = nodeThree;
        sll.add(head);
        sll.add(nodeTwo);
        sll.add(nodeThree);

        Assert.assertEquals(nodeTwo, head.next);
        Assert.assertEquals(nodeThree, nodeTwo.next);
    }

    @Test
    public void testContainsMethodLinkedList(){
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.ListNode head = new SinglyLinkedList.ListNode(1);
        SinglyLinkedList.ListNode nodeTwo = new SinglyLinkedList.ListNode(2);
        SinglyLinkedList.ListNode nodeThree = new SinglyLinkedList.ListNode(3);
//        head.next = nodeTwo;
//        nodeTwo.next = nodeThree;
        sll.add(head);
        sll.add(nodeTwo);
        sll.add(nodeThree);
        boolean expected = sll.contains(3);

        Assert.assertEquals(nodeTwo, head.next);
        Assert.assertEquals(nodeThree, nodeTwo.next);
    }

    @Test
    public void testSizeMethodLinkedList(){
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.ListNode head = new SinglyLinkedList.ListNode(1);
        SinglyLinkedList.ListNode nodeTwo = new SinglyLinkedList.ListNode(2);
        SinglyLinkedList.ListNode nodeThree = new SinglyLinkedList.ListNode(3);
        sll.add(head);
        sll.add(nodeTwo);
        sll.add(nodeThree);
        int expected = sll.size();

        Assert.assertEquals(3, expected);
    }


    @Test
    public void testGetMethodLinkedList(){
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyLinkedList.ListNode head = new SinglyLinkedList.ListNode(1);
        SinglyLinkedList.ListNode nodeTwo = new SinglyLinkedList.ListNode(2);
        SinglyLinkedList.ListNode nodeFour = new SinglyLinkedList.ListNode(45);
        SinglyLinkedList.ListNode nodeFive = new SinglyLinkedList.ListNode(47);
        SinglyLinkedList.ListNode nodeSix = new SinglyLinkedList.ListNode(498);
        SinglyLinkedList.ListNode nodeSeven = new SinglyLinkedList.ListNode(41);
        SinglyLinkedList.ListNode nodeEight = new SinglyLinkedList.ListNode(467);

        sll.add(head);
        sll.add(nodeTwo);
        sll.add(nodeFour);
        sll.add(nodeFive);
        sll.add(nodeSix);
        sll.add(nodeSeven);
        sll.add(nodeEight);
        int expected = sll.get(4);

        Assert.assertEquals(498, expected);
    }









}
