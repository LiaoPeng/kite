package com.galaxy.kite.algorithm.leetcode;

public class LinkedListCycleII {

	public ListNode detectCycle(ListNode head) {

		ListNode cpHead = head;
		ListNode slowNode = head, fastNode = head;
		boolean isExistCycle = false;
		while (cpHead != null && cpHead.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
			if (slowNode == fastNode) {
				isExistCycle = true;
				break;
			}
		}
		if(isExistCycle){
			
		}
		return null;
	}

}
