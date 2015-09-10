package binarytree;

public class BT {
	
	/*
	 * In-Order Traversal
	 * Left -> Root -> Right
	 */
	public void printInOrder(BTNode node) {
		BTNode current = node;
		
		if(current == null) {
			return;
		}
		
		printInOrder(current.getLeftNode());
		
		System.out.println(current.getData());
		
		printInOrder(current.getRightNode());
	}
	
	/*
	 * Pre-Order Traversal
	 * Root -> Left -> Right
	 */
	public void printPreOrder(BTNode node) {
		BTNode current = node;
		if(current == null) {
			return;
		}
		
		System.out.println(current.getData());
		
		printInOrder(current.getLeftNode());
		
		printInOrder(current.getRightNode());
	}
	
	/*
	 * Post-Order Traversal
	 * Left -> Right -> Root
	 */
	public void printPostOrder(BTNode node) {
		BTNode current = node;
		if(current == null) {
			return;
		}
		
		printInOrder(current.getLeftNode());
		
		printInOrder(current.getRightNode());
		
		System.out.println(current.getData());
	}
	
}
