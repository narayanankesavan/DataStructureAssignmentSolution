package com.greatlearning.company.main;

import com.greatlearning.company.model.Node;
import com.greatlearning.company.service.TreeService;

public class Driver {
	public static Node node;

	public static void main(String[] args) {
		TreeService tree = new TreeService();
		TreeService.node = new Node(50);
		TreeService.node.left = new Node(30);
		TreeService.node.right = new Node(60);
		TreeService.node.left.left = new Node(10);
		TreeService.node.left.right = new Node(40);

		tree.convertBSTToSkewedTree(TreeService.node);
		tree.traverseTree(TreeService.headNode);

	}

}
