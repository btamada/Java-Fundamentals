package interview_questions;

public class Node<T extends Comparable<T>> {
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		if(next == null) return;
		this.next = next;
	}
	
	public Node(T data) {
		this.data = data;
		this.visited = false;
	}
	
	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}
	
	private T data;
	private boolean visited;
	private Node<T> next;
}
