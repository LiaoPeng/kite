package com.galaxy.kite.algorithm.leetcode;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CloneGraphTest {
	
	private CloneGraph cloneGraph  = null;
	
	@Before
	public void setUp(){
		cloneGraph = new CloneGraph();
	}

	@Test
	public void test1() {
		
		UndirectedGraphNode node = new UndirectedGraphNode(0);
		
		UndirectedGraphNode node1 = new UndirectedGraphNode(1);
		UndirectedGraphNode node2 = new UndirectedGraphNode(2);
		UndirectedGraphNode node3 = new UndirectedGraphNode(3);
		
		node2.neighbors.add(node2);
		
		node.neighbors.add(node1);
		node.neighbors.add(node2);
		node.neighbors.add(node3);
		node.neighbors.add(node);
		
		UndirectedGraphNode copyNode = cloneGraph.cloneGraph(node);
		System.out.println(copyNode);
	}

	@Test
	public void test2() {
		
		UndirectedGraphNode node = new UndirectedGraphNode(0);
		
		UndirectedGraphNode copyNode = cloneGraph.cloneGraph(node);
		System.out.println(copyNode);
	}
	
	@Test
	public void test3() {
		
		UndirectedGraphNode node = null;
		
		UndirectedGraphNode copyNode = cloneGraph.cloneGraph(node);
		System.out.println(copyNode);
	}
}
