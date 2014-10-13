package com.galaxy.kite.algorithm.leetcode;



import java.util.List;

import org.junit.Before;
import org.junit.Test;



public class BinaryTreePostorderTraversalTest {

	private BinaryTreePostorderTraversal postorderTraversal = new BinaryTreePostorderTraversal();

	TreeNode root = new TreeNode(0);
	TreeNode node1 = new TreeNode(1);
	TreeNode node2 = new TreeNode(2);

	@Before
	public void setUp() {

	}

	@Test
	public void testPostorderTraversal() {

		root.left = node1;
		root.right = node2;

		List<Integer> visitedList = postorderTraversal.postorderTraversal(root);
		System.out.println(visitedList);
		

	}

}
