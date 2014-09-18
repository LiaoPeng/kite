package com.galaxy.kite.algorithm.leetcode;



public class InsertionSortList {

	public ListNode insertionSortList(ListNode head) {

		return insertSort(head);

	}

	public ListNode insertSort(ListNode head) {

		ListNode head1 = head;
		head =null;
		while (head1 != null) {

			ListNode insertNode = head1;
			head1 = head1.next;

			if (head==null || insertNode.val < head.val) {
				insertNode.next = head;
				head = insertNode;
				continue;
			} 
			ListNode tempNode = head;
			while (tempNode!= null){
				if(tempNode.next == null || insertNode.val < tempNode.next.val){
					insertNode.next = tempNode.next;
					tempNode.next = insertNode;
					break;
				}
				tempNode = tempNode.next;
			}
		}
		return head;
	}
}
