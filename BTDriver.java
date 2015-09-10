package binarytree;

public class BTDriver {

	public static void main(String[] args) {
		BTNode root = new BTNode(1);
		root.setLeftNode(5);
		root.setRightNode(2);
		root.getLeftNode().setLeftNode(11);
		root.getRightNode().setRightNode(20);
		
		BT bt = new BT();
		bt.printInOrder(root);
	}

}
