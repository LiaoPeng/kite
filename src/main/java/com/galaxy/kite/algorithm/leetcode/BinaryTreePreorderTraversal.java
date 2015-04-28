package com.galaxy.kite.algorithm.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import com.galaxy.kite.algorithm.leetcode.model.TreeNode;



public class BinaryTreePreorderTraversal {

	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> visitedList = new LinkedList<Integer>();
		preorderTraversalNonrecursion(root, visitedList);
		return visitedList;
	}

	private void preorderTraversalNode(TreeNode node, List<Integer> visitedList) {

		if (node == null)
			return;
		visitedList.add(node.val);
		if (node.left != null) {
			preorderTraversalNode(node.left, visitedList);
		}
		if (node.right != null) {
			preorderTraversalNode(node.right, visitedList);
		}
	}

	private void preorderTraversalNonrecursion(TreeNode root,
			List<Integer> visitedList) {
		if (root == null)
			return;
		Deque<TreeNode> stack = new LinkedList<TreeNode>();
		stack.add(root);
		TreeNode node = null;
		while (!stack.isEmpty()) {
			node = stack.pop();
			visitedList.add(node.val);
			if (node.right != null) {
				stack.add(node.right);
			}
			if (node.left != null) {
				stack.add(node.left);
			}
		}
	}

}
