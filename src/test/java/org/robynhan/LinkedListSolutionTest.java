package org.robynhan;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNull;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class LinkedListSolutionTest {

    ListNode node1 = new ListNode(1);
    ListNode node2 = new ListNode(1);
    ListNode node3 = new ListNode(2);
    ListNode node4 = new ListNode(4);
    ListNode node5 = new ListNode(5);

    LinkedListSolution linkedListSolution = new LinkedListSolution();

    @Before
    public void init() {
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = node5;
    }

    @Test
    public void should_be_success_if_delete_normal_element() {
        node1.next = node2;
        assertNull(linkedListSolution.removeElements(node1, 1));
    }

    @Test
    public void should_be_success_if_delete_head_element() {
        node1.next = node3;
        node3.next = node4;
        assertThat(linkedListSolution.removeElements(node1, 3), is(node1));
    }

    @Test
    public void should_be_success_if_delete_noExist_element() {
        node1.next = node3;
        node3.next = node4;
        assertThat(linkedListSolution.removeElements(node1, 6),is(node1));
    }

    @Test
    public void should_be_success_if_delete_serial_elements() {
        ListNode n1 = new ListNode(5);
        ListNode n2 = new ListNode(6);
        ListNode n3 = new ListNode(6);
        n1.next = n2;
        n2.next = n3;
        linkedListSolution.removeElements(n1, 6);
        assertNull(n1.next);
    }

}
