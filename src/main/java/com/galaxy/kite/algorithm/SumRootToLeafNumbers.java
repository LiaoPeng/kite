package com.galaxy.kite.algorithm;

import com.galaxy.kite.algorithm.leetcode.model.TreeNode;



public class SumRootToLeafNumbers {
	
	private int sumOfLeafs = 0;

	public int sumNumbers(TreeNode root) {
		sumNumbers(root,0);
		return sumOfLeafs;
	}
	
	private void sumNumbers(TreeNode node,int sumLeaf ){
		
		if (node == null)	return;

		if (node.left == null && node.right == null) {
			sumOfLeafs += sumLeaf*10 + node.val;
			return;
		}
		if (node.left != null) {
			sumNumbers(node.left, sumLeaf *10 + node.val);
		}
		if (node.right != null) {
			sumNumbers(node.right, sumLeaf*10 + node.val);
		}
	}
}
