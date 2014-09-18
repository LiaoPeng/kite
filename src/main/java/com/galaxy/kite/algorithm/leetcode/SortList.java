package com.galaxy.kite.algorithm.leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class SortList {

	public ListNode sortList(ListNode head) {

		int count = 0;
		ListNode temp = head;
		while (head != null) {
			count++;
			head = head.next;
		}
		return mergeSort(temp, count);
	}

	public ListNode mergeSort(ListNode head, int n) {

		if (n == 1 || n == 0) {
			return head;
		}
		ListNode head1 = head, head2 = head;

		int countHead1 = 1;
		while (countHead1 < n / 2) {
			head1 = head1.next;
			countHead1++;
		}
		head2 = head.next;
		head1.next = null;

		head1 = mergeSort(head, n / 2);
		head2 = mergeSort(head2, n - n / 2);
		ListNode tail = new ListNode(0);
		head = tail;
		while (head1 != null && head2 != null) {

			if (head1.val < head2.val) {
				tail.next = head1;
				head1 = head1.next;
			} else {
				tail.next = head2;
				head2 = head2.next;
			}
			tail = tail.next;
		}

		if (head1 == null && head2 != null) {
			tail.next = head2;
		} else if (head1 != null && head2 == null) {
			tail.next = head1;
		}
		return head.next;
	}

	public ListNode quickSort(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode povit = head;
		ListNode head1 = null, tempHead1 = null;
		ListNode head2 = null, temphead2 = null;
		head = head.next;
		while (head != null) {
			if (head.val < povit.val) {
				if (head1 != null) {
					head1.next = head;
					head1 = head1.next;
				} else {
					head1 = head;
					tempHead1 = head;
				}
			} else {
				if (head2 != null) {
					head2.next = head;
					head2 = head2.next;
				} else {
					head2 = head;
					temphead2 = head;
				}
			}
			head = head.next;
		}
		if (head1 != null) {
			head1.next = null;
		}
		if (head2 != null) {
			head2.next = null;
		}

		head1 = quickSort(tempHead1);
		head2 = quickSort(temphead2);

		povit.next = head2;
		if (head1 == null) {
			return povit;
		} else {
			ListNode tempListNode = head1;
			while (tempListNode.next != null) {
				tempListNode = tempListNode.next;
			}
			tempListNode.next = povit;
			return head1;
		}

	}

	public static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}
}
