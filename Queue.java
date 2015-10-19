package queue;

import java.io.IOException;

public class Queue {
	private Node first;
	private Node last;
	
	private class Node {
		int data;
		Node next;
		boolean hasNext;
	}
	/*
	 * Is the queue empty?
	 */
	public boolean isEmpty() {
		return first == null;
	}
	
	/*
	 * Print out the queue contents
	 */
	public void print() {
		Node current = first;
		while(current != null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	/*
	 * Add a new node to the queue
	 */
	public void enqueue(int data) {
		Node x = new Node();
		x.data = data;
		x.next = null;
		if(isEmpty()) {
			first = x;
			first.hasNext = false;
			last = x;
			last.hasNext = false;
		} else {
			last.next = x;
			last.hasNext = false;
			last = x;
		}
	}
	
	/*
	 * Remove the first node from the queue
	 */
	public int dequeue()  {
		if(isEmpty()) { return -1; }
		int data = first.data;
		first = first.next;
		System.out.println("The element removed was: " + data);
		return data;
	}
	
	/*
	 * Does the first node have a node coming after it?
	 */
	public boolean hasNext() {
		return first.hasNext;
	}
}
