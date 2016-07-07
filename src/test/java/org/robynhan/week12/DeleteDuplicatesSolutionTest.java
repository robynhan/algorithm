package org.robynhan.week12;

import org.junit.Test;
import org.robynhan.ListNode;

import static org.junit.Assert.*;

public class DeleteDuplicatesSolutionTest {

    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
//        ListNode node2 = new ListNode(3);
//        ListNode node3 = new ListNode(4);
//        ListNode node4 = new ListNode(5);
        head.next = node1;
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;

//        RemoveNthFromEndSolution solution = new RemoveNthFromEndSolution();
//        solution.removeNthFromEnd(head, 2);

        ReverseIntegerSolution solution1 = new ReverseIntegerSolution();
        solution1.reverseInteger(0);
    }
}