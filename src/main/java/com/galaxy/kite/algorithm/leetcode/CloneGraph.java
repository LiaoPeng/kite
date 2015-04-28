package com.galaxy.kite.algorithm.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class UndirectedGraphNode {
    int label;
    List<UndirectedGraphNode> neighbors;
    UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
};

public class CloneGraph {
	

	private Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<UndirectedGraphNode, UndirectedGraphNode>();

	public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
		UndirectedGraphNode copyNode = null;
		if(node != null){
			copyNode = new UndirectedGraphNode(node.label);
			map.put(node, copyNode);
			for(UndirectedGraphNode tempNode: node.neighbors){
				UndirectedGraphNode tempCopyNode = map.get(tempNode) != null 
						? map.get(tempNode) : cloneGraph(tempNode);
				copyNode.neighbors.add(tempCopyNode);	
			}
		}
		return copyNode;
	}
}
