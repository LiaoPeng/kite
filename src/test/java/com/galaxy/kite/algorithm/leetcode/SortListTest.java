package com.galaxy.kite.algorithm.leetcode;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortListTest {

	private SortList sortList = new SortList();

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
	public void testQuickSort() {

		ListNode temp = sortList.quickSort(head);
		while (temp != null) {

			System.out.println(temp.val);
			temp = temp.next;

		}

	}

	@Test
	public void testSet() {

		Set<String> periodStringSet = new HashSet<String>(24);

		String periodString = "12";

		if (!periodStringSet.contains(periodString)) {
			System.out.println(1);
			periodStringSet.add(periodString);
		}

		if (!periodStringSet.contains(periodString)) {
			System.out.println(1);
			periodStringSet.add(periodString);
		}
	}

	@Test
	public void testMergeSort() {
		ListNode temp = head;
		SortList.printList(temp);
		ListNode temp1 = sortList.sortList(head);
		SortList.printList(temp1);
		ListNode temp2 = sortList.quickSort(temp1);

		SortList.printList(temp2);

		while (temp1 != null) {

			Assert.assertEquals(temp1.val, temp2.val);
			temp1 = temp1.next;
			temp2 = temp2.next;
		}
	}

	@Test
	public void testSquare() {

		int n = 10;

		int[][] square = produceSquare(n);

		for (int i = n - 1; i >= 0; i--) {
			int x = 0, y = i;
			for (int j = 0; j < (n - i); j++) {
				System.out.print(square[x][y] + " ");
				x++;
				y++;
			}
			System.out.println();
		}
	}

	private int[][] produceSquare(int n) {

		int[][] array = new int[n][n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				array[i][j] = ++count;
			}
		}
		return array;
		
	}

}
