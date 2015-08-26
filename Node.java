package singlylinkedlist;

public class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
	
	/*
	 * Print out the SLL
	 * Time: O(n)
	 * Space: O(1)
	 */
	public void print(Node head) {
		while(head.next != null) {
			System.out.println(head.data);
			head = head.next;
		}
		System.out.println(head.data);
	}
	
	/*
	 * Add a node to the SLL
	 * Time: O(1)
	 * Space: O(1)
	 */
	public void addNode(int data) {
		Node tail = new Node(data);
		Node current = this;
		
		while(current.next != null) {
			current = current.next;
		}
		
		current.next = tail;
	}
	
	/*
	 * Delete a node from the SLL
	 * Time: O(n)
	 * Space: O(1)
	 */
	public boolean deleteNode(Node head, int data) {
		/*
		 * We don't delete the head node, we just return the 
		 */
		Node current = head;
		
		if(current.data == data) {
			current = current.next;
			return true;
		}
		
		while(current.next != null) {
			if(current.next.data == data) {
				current.next = current.next.next;
				return true;
			}
			current = current.next;
		}
		return false;
	}
	
	/*
	 * Search for a node in the SLL
	 * Time: O(n)
	 * Space: O(1)
	 */
	public boolean searchNode(int data) {
		Node current = this;
		
		while(current.next != null) {
			if(current.data == data || current.next.data == data) {
				return true;
			}
			current = current.next;
		}
		return false;
	}
}
