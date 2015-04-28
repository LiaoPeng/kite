package com.galaxy.kite.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

class RandomListNode {
	int label;
	RandomListNode next, random;

	RandomListNode(int x) {
		this.label = x;
	}
}

public class CopyListWithRandomPointer {

	private Map<RandomListNode, RandomListNode> referenceMap = new HashMap<RandomListNode, RandomListNode>();

	public RandomListNode copyRandomList(RandomListNode head) {

		RandomListNode cycleNode = detectCycle(head);
		RandomListNode newHead = null, originalHead = head, tempNode = null;

		if (head != null) {
			newHead = new RandomListNode(head.label);
			tempNode = newHead;
			referenceMap.put(head, tempNode);
		} else {
			return null;
		}

		RandomListNode newCycleNode = null;
		while (head != null && head.next != null) {

			if (head.next == cycleNode && newCycleNode == null) {
				tempNode.next = new RandomListNode(head.next.label);
				newCycleNode = tempNode.next;
			} else if (head.next == cycleNode && newCycleNode != null) {
				tempNode.next = newCycleNode;
				break;
			} else {
				tempNode.next = new RandomListNode(head.next.label);
			}

			tempNode = tempNode.next;
			head = head.next;
			referenceMap.put(head, tempNode);
		}

		head = originalHead;
		tempNode = newHead;
		newCycleNode = null;

		while (head != null) {
			if (head == cycleNode && newCycleNode == null) {
				newCycleNode = head;
			} else if (head == cycleNode && newCycleNode != null) {
				break;
			}
			tempNode.random = referenceMap.get(head.random);
			head = head.next;
			tempNode = tempNode.next;
		}

		return newHead;
	}

	public RandomListNode detectCycle(RandomListNode head) {

		RandomListNode cpHead = head;
		RandomListNode slowNode = head, fastNode = head;
		boolean isExistCycle = false;
		while (fastNode != null && fastNode.next != null
				&& fastNode.next.next != null) {
			slowNode = slowNode.next;
			fastNode = fastNode.next.next;
			if (slowNode == fastNode) {
				isExistCycle = true;
				break;
			}
		}
		RandomListNode cycleNode = null;
		if (isExistCycle) {
			slowNode = cpHead;
			while (slowNode != fastNode) {
				slowNode = slowNode.next;
				fastNode = fastNode.next;
			}
			cycleNode = slowNode;
		}
		return cycleNode;
	}

	public static void main(String[] args) {
		
		CopyListWithRandomPointer copyPointer = new CopyListWithRandomPointer();
		copyPointer.copyRandomList(new RandomListNode(9));
		copyPointer.copyRandomList(null);
		
		RandomListNode head = new RandomListNode(9);
		head.next = head;
		head.random = head;
		RandomListNode copyHead = copyPointer.copyRandomList(head);
		
		System.err.println("dd");
	}
}
