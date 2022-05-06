package de.unistuttgart.dsass2022.ex03.p5;

import java.util.Iterator;
//START SOLUTION
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinarySearchTree<T extends Comparable<T>> implements IBinarySearchTreeIterable<T> {

	private volatile IBinaryTreeNode<T> root;

	public BinarySearchTree() {
		this.root = null;
	}

	@Override
	public void insert(T t) {
		this.root = this.insert(this.root, t);
	}

	private IBinaryTreeNode<T> insert(IBinaryTreeNode<T> node, T t) {
		if (node == null) {
			IBinaryTreeNode<T> newNode = new BinaryTreeNode<>();
			newNode.setValue(t);
			return newNode;
		}
		if (t.compareTo(node.getValue()) < 0) {
			node.setLeftChild(this.insert(node.getLeftChild(), t));
		} else if (t.compareTo(node.getValue()) > 0) {
			node.setRightChild(this.insert(node.getRightChild(), t));
		}
		return node;
	}

	@Override
	public IBinaryTreeNode<T> getRootNode() {
		return this.root;
	}

	/**
	 * Returns a boolean whether the tree is full or not. See slides
	 * "V05_Baeume" page 23 for the definition of a full tree. Here,
	 * "full" refers to the German "voll".
	 *
	 * @return a boolean whether the tree is full
	 */
	@Override
	public boolean isFull() {
		return false;
	}

	/**
	 * Returns an iterator which traverses the tree given a traversal type
	 *
	 * @param traversalType traversal type
	 * @return an iterator which traverses the tree given a traversal type
	 */
	@Override
	public Iterator<T> iterator(TreeTraversalType traversalType) {
		return null;
	}
}
