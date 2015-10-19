package bst;

import java.util.Iterator;

public class BST<Key extends Comparable<Key>, Value> implements Iterable<Key> {
	private Node root;
	
	private class Node
	{
		Key key;
		Value val;
		Node left, right;
		
		Node(Key key, Value val)
		{
			this.key = key;
			this.val = val;
		}
	}
	
	public Node put(Node node, Key key, Value val)
	{
		if (node == null) return new Node(key, val);
		int cmp = key.compareTo(node.key);
		if(cmp == 0) node.val = val;
		else if (cmp < 0) node.left = put(node.left, key, val);
		else if (cmp > 0) node.right = put(node.right, key, val);
		return node;
	}
	
	public Value get(Key key)
	{
		Node current = root;
		while(current != null)
		{
			int cmp = key.compareTo(current.key);
			if(cmp == 0) return current.val;
			else if (cmp < 0) current = current.left;
			else if (cmp > 0) current = current.right;
		}
		return null;
	}

	@Override
	public Iterator<Key> iterator() {
		return new BSTIterator();
	}
	
	private class BSTIterator implements Iterator<Key>
	{
		
		BSTIterator()
		{
			
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public Key next() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

}
