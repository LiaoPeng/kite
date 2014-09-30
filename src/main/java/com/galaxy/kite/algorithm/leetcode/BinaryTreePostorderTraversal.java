package com.galaxy.kite.algorithm.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}

public class BinaryTreePostorderTraversal {
	
	class Pair{
		boolean isVisited = false;
		TreeNode node;
		
		Pair(TreeNode node, boolean isVisited){
			this.node = node;
			this.isVisited = isVisited;
		}
	}

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> visitList = new LinkedList<Integer>();
		// postorderTraversalNode(root, visitList);
		postorderTraversalNodeNonRecursion(root, visitList);
		return visitList;
	}

	private void postorderTraversalNode(TreeNode node, List<Integer> visitList) {

		if (node != null && node.left != null) {
			postorderTraversalNode(node.left, visitList);
		}
		if (node != null && node.right != null) {
			postorderTraversalNode(node.right, visitList);
		}
		visitList.add(node.val);
	}

	private void postorderTraversalNodeNonRecursion(TreeNode root,
			List<Integer> visitedList) {

		Deque<Pair> stack = new LinkedList<Pair>();
		if (root == null) {
			return;
		} else {
			stack.push(new Pair(root,false));
		}

	}
}
