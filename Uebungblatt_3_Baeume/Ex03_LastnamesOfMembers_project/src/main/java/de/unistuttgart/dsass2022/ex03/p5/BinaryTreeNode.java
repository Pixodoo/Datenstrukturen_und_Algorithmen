package de.unistuttgart.dsass2022.ex03.p5;

public class BinaryTreeNode<T extends Comparable<T>> implements IBinaryTreeNode<T> {
	T value;
	T leftChildNode;
	T rightChildNode;
	
	public BinaryTreeNode() {
		T value = null;
		T leftChildNode = null;
		T rightChildNode = null;
	}


	/**
	 * Sets the value of the node.
	 *
	 * @param val value of the node
	 */
	@Override
	public void setValue(T val) {
		this.value = val;

	}

	/**
	 * Returns the value of the node.
	 *
	 * @return value of the node
	 */
	@Override
	public T getValue() {
		return this.value;
	}

	/**
	 * Sets the left child of the node.
	 *
	 * @param left left child
	 */
	@Override
	public void setLeftChild(IBinaryTreeNode<T> left) {
		this.leftChildNode = left;

	}

	/**
	 * Returns the left child of the node.
	 *
	 * @return left child of the node
	 */
	@Override
	public IBinaryTreeNode<T> getLeftChild() {
		return this.leftChildNode;
	}

	/**
	 * Sets the right child of the node.
	 *
	 * @param right right child of the node
	 */
	@Override
	public void setRightChild(IBinaryTreeNode<T> right) {
		this.rightChildNode = right;

	}

	/**
	 * Returns the right child of the node.
	 *
	 * @return right child of the node
	 */
	@Override
	public IBinaryTreeNode<T> getRightChild() {
		return this.rightChildNode;
	}
}
