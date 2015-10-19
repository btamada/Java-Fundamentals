package stack;

public class Stack {
	private Node first = null;
	
	private class Node {
		String item;
		Node next;
		
		public Node(String item) {
			this.item = item;
			this.next = null;
		}
	}
	
	public void print() {
		Node current = first;
		if(current == null) return;
		else {
			while(current != null) {
				System.out.println(current.item);
				current = current.next;
			}
		}
	}
	
	public boolean isEmpty() {
		System.out.println(first);
		return first == null;
	}
	
	public void push(String item) {
		if(first == null) {
			first = new Node(item);
		} else {
			Node newNode = new Node(item);
			Node second = first;
			newNode.next = second;
			first = newNode;
		}
	}
	
	public String pop() {
		String item = first.item;
		first = first.next;
		System.out.println("Removed: " + item);
		return item;
	}
	
	public String peek() {
		System.out.println(first.item);
		return (first.item != null) ? first.item : null;
	}
}
