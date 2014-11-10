package com.galaxy.kite.algorithm.leetcode;


public class RecorderList {

	public void reorderList(ListNode head) {

		if (head == null || head.next == null) {
			return;
		}
		ListNode slowNode = head;
		ListNode fastNode = head;
		while (fastNode.next != null && fastNode.next.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
		}
		ListNode halfSegment = slowNode.next;
		slowNode.next = null;
		halfSegment = reverseSingleList(halfSegment);
		ListNode firstHalf = head;
		mergeTwoList(firstHalf, halfSegment);
	}

	public ListNode reverseSingleList(ListNode head) {
		ListNode orginalNode = null;
		ListNode currentNode = null;
		while (head != null) {
			currentNode = head;
			head = head.next;
			currentNode.next = orginalNode;
			orginalNode = currentNode;
		}
		return orginalNode;
	}

	public void mergeTwoList(ListNode firstHead, ListNode secondHead) {
		ListNode head = new ListNode(-1);
		while (firstHead != null && secondHead != null) {
			head.next = firstHead;
			firstHead = firstHead.next;
			head.next.next = secondHead;
			secondHead = secondHead.next;
			head = head.next.next;
		}
		if (firstHead != null) {
			head.next = firstHead;
		}
	}
}
