package interview_questions;

public class LinkedList<T extends Comparable<T>> {
	
	/*
	 * Implement the rabbit and the hare algorithm
	 */
	public boolean findCircular(Node<T> head) {
		if(head == null) return false;
		Node<T> tortoise = head;
		Node<T> hare = head.getNext();
		
		while(tortoise != null || hare != null) {
			if(tortoise.getData().compareTo(hare.getData()) == 0) return true;
			hare = hare.getNext().getNext();
			System.out.println("hare data: " + hare.getData());
			tortoise = tortoise.getNext();
			System.out.println("tortoise data: " + tortoise.getData());
		}
		
		return false;
	}
	
	/*
	 * Insert a new node into the LL
	 */
	public Node<T> insert(Node<T> head, T data) {
		if(head == null || data == null) return null;
		Node<T> current = head;
		while(current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(new Node<T>(data));
		return current.getNext();
	}
	
	/*
	 * Reverse a LL using recursion
	 */
	public void reverse(Node<T> head) {
		if(head == null) return;
		
		Node<T> current = head;
		while(current != null || current.isVisited() != false) {
			
			current = current.getNext();
		}
	}
	
	/*
	 * Print out the LL
	 */
	public void print(Node<T> head) {
		if(head == null) return;
		
		Node<T> current = head;
		while(current != null) {
			System.out.print(current.getData() + " -> ");
			current = current.getNext();
		}
	}
	
}
