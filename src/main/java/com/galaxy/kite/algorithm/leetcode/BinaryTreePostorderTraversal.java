package com.galaxy.kite.algorithm.leetcode;

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
	

	public List<Integer> postorderTraversal(TreeNode root) {
		List<Integer> visitList = new LinkedList<Integer>();
		postorderTraversalNode(root, visitList);
		return visitList;
	}

	private void postorderTraversalNode(TreeNode node,List<Integer> visitList){
		
		if(node.left !=null) {
			postorderTraversalNode(node.left,visitList);
		} else if (node.right !=null) {
			postorderTraversalNode(node.right, visitList);
		}
		visitList.add(node.val);
	}
}
