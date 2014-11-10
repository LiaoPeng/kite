package com.galaxy.kite.algorithm.leetcode;

import org.junit.Ignore;
import org.junit.Test;

public class RecorderListTest {

	private RecorderList recorderList = new RecorderList();

	@Test
	@Ignore
	public void testReverseSingleList() {

		ListNode head = generateList(1);
		ListNode.printListNode(head);
		ListNode newHead = recorderList.reverseSingleList(head);
		ListNode.printListNode(newHead);
	}

	@Test
	public void RecorderListTest() {

		ListNode head = generateList(3);
		ListNode.printListNode(head);
		recorderList.reorderList(head);
		ListNode.printListNode(head);
	}

	private ListNode generateList(int size) {
		ListNode head = null;
		ListNode lastNode = null;
		for (int i = 0; i < size; i++) {
			ListNode newNode = new ListNode(i);
			if (head == null) {
				head = newNode;
				lastNode = newNode;
			} else {
				lastNode.next = newNode;
				lastNode = newNode;
			}

		}
		return head;
	}

}
