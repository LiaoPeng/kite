package com.galaxy.kite.algorithm.leetcode;

public class LinkedListCycleII {

	/**
	 * Question: Given a linked list,
	 *  		 return the node where the cycle begins
	 * Procedure:
	 * 1. Use slow and fast pointer to judge  
	 * 
	 * @param head
	 * @return
	 */
	public ListNode detectCycle(ListNode head) {

		ListNode cpHead = head;
		ListNode slowNode = head, fastNode = head;
		boolean isExistCycle = false;
		while (cpHead.next != null && cpHead.next.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
			if (slowNode == fastNode) {
				isExistCycle = true;
				break;
			}
		}
		ListNode cycleNode = null;
		if(isExistCycle){
			slowNode = cpHead;
			while(slowNode != fastNode){
				slowNode = slowNode.next;
				fastNode = fastNode.next;
			}
			cycleNode = slowNode;
		}
		return cycleNode;
	}

}
