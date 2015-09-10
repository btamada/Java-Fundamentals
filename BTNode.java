package binarytree;

public class BTNode {
	private int data;
	private BTNode left, right;
	
	public BTNode(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
	
	public int getData() {
		return this.data;
	}
	
	public boolean hasLeftNode() {
		return this.left != null ? true : false; 
	}
	
	public boolean hasRightNode() {
		return this.right != null ? true : false;
	}
	
	public BTNode getLeftNode() {
		return this.left;
	}
	
	public BTNode getRightNode() {
		return this.right;
	}
	
	public void setLeftNode(int leftData) {
		this.left = new BTNode(leftData);
	}
	
	public void setRightNode(int rightData) {
		this.right = new BTNode(rightData);
	}
}
