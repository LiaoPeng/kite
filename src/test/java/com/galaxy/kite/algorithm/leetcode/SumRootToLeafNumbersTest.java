package com.galaxy.kite.algorithm.leetcode;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.galaxy.kite.algorithm.SumRootToLeafNumbers;
import com.galaxy.kite.algorithm.leetcode.model.TreeNode;

@RunWith(Parameterized.class)
public class SumRootToLeafNumbersTest {
	
	
	private TreeNode root;
	private int result;
	
	public SumRootToLeafNumbersTest(TreeNode root, int result){
		this.root = root;
		this.result = result;
	}
	
	@Parameters
	public static Collection<?> getParameters(){
		
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(3);
		root.left = left;
		
		TreeNode right = new TreeNode(2);
		root.right =right;
		
		Object[][] treeNodes = new Object[][] { { null, 0 }, { root, 25 },
				{ right, 2 } };
		
		return Arrays.asList(treeNodes);
	}

	@Test
	public void testCase1(){
		
		SumRootToLeafNumbers sumNumber  = new SumRootToLeafNumbers();
		int result = sumNumber.sumNumbers(root);
		System.out.println(result);
		Assert.assertEquals(this.result, result);
	}

}
