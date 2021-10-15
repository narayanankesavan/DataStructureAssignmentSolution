package com.greatlearning.company.service;

import com.greatlearning.company.model.Node;

public class TreeService {
	public static Node node, prevNode = null, headNode = null;

	// to convert BST to Skewed Tree
	public void convertBSTToSkewedTree(Node root) {
		// check for null tree
		if (root == null) {
			return;
		}

		// use recursion
		convertBSTToSkewedTree(root.left);
		Node rightNode = root.right;

		if (headNode == null) {
			headNode = root;
		} else {
			prevNode.right = root;
		}
		root.left = null;
		prevNode = root;

		// do recursion with rightNode
		convertBSTToSkewedTree(rightNode);
	}

	// traverse the right skewed tree using recursion
	public void traverseTree(Node root) {
		if (root == null) {
			return;
		}

		System.out.print(root.value + " ");
		traverseTree(root.right);
	}

}
