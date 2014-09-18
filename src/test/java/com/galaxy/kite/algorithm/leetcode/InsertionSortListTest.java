package com.galaxy.kite.algorithm.leetcode;

import java.util.Random;

import org.junit.Before;
import org.junit.Test;

public class InsertionSortListTest {
	
	private InsertionSortList insertionSortList = new InsertionSortList();
	
	ListNode head = new ListNode(2);

	@Before
	public void setUp() {
		Random random = new Random();
		ListNode tempNode = head;
		for (int i = 0; i < 12; i++) {
			tempNode.next = new ListNode(random.nextInt(100));
			tempNode = tempNode.next;
		}
	}
	
	@Test
	public void testInsertionSort(){
		SortList.printList(head);
		head = insertionSortList.insertionSortList(head);
		SortList.printList(head);
		
		
		
	}

}
