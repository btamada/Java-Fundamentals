package interview_questions;

public class Driver {

	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		Node<Integer> head = new Node<Integer>(2);
		Node<Integer> n0 = new Node<Integer>(0);
		Node<Integer> n7 = new Node<Integer>(7);
		Node<Integer> n4 = new Node<Integer>(4);
		Node<Integer> n1 = new Node<Integer>(1);
		Node<Integer> n9 = new Node<Integer>(9);
		Node<Integer> n5 = new Node<Integer>(5);
		Node<Integer> n3 = new Node<Integer>(3);
		
		head.setNext(n0);
		n0.setNext(n7);
		n7.setNext(n4);
		n4.setNext(n1);
		n1.setNext(n9);
		n9.setNext(n5);
		n5.setNext(n3);
		n3.setNext(head);
		
		System.out.println(ll.findCircular(head));
	}

}
