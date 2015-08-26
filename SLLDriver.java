package singlylinkedlist;

public class SLLDriver {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.addNode(3);
		head.addNode(5);
		head.addNode(7);
		head.addNode(9);
		head.addNode(100);
		System.out.println(head.deleteNode(head, 1));
		//head.print(head);	
	}

}
