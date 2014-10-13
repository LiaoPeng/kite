package com.galaxy.kite.algorithm.leetcode;

import java.util.List;

import org.junit.Before;
import org.junit.Test;



public class BinaryTreePreorderTraversalTest {

	private BinaryTreePreorderTraversal preorderTraversal = new BinaryTreePreorderTraversal();

	TreeNode root = new TreeNode(2);
	TreeNode node1 = new TreeNode(3);
	TreeNode node2 = new TreeNode(4);
	List<Integer> visitedList = null;

	@Test
	public void testPreorderTraversal() {
		
		root.left = node1;
		node1.right = node2;
		visitedList = preorderTraversal.preorderTraversal(root);
		System.out.println(visitedList);
	}
	
	@Test
	public void testPreorderTraversalCase1(){
		root.left = node1;
		root.right = node2;
		visitedList = preorderTraversal.preorderTraversal(root);
		System.out.println(visitedList);
	}
	
	
}
