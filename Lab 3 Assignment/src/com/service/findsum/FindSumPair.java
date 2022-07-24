package com.service.findsum;

import java.util.HashSet;

import com.node.findsum.Node;

public class FindSumPair {

	public Node insert(Node root, int key) {
	
		if (root == null)
			return new Node(key);
		if(key < root.nodeData)
			root.leftNode= insert(root.leftNode, key);
		else
			root.rightNode = insert(root.rightNode, key);
		
		return root;
	}

	
	public void findPairWithGivenSum(Node root, int sum) {
		HashSet<Integer> set = new HashSet<Integer>();
		
		if(!findpairUtil(root, sum, set))
			System.out.println("Pairs do not exit" + "\n");
		findpairUtil(root,sum,set);
		
		
	}
	public boolean findpairUtil(Node root, int sum, HashSet<Integer> set) {
		if (root == null)
			return false;
		if (findpairUtil(root.leftNode, sum, set))
			return true;
		if(set.contains(sum-root.nodeData)) {
		System.out.println("Pair is found (" + (sum-root.nodeData) + "," + root.nodeData + ")");
		return true;
		
		}
		else
		set.add(root.nodeData);
		return findpairUtil(root.rightNode, sum, set);
		
		
		
	}

}
