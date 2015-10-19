package queue;

public class QueueDriver {

	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.enqueue(9);
		queue.enqueue(14);
		queue.enqueue(3);
		queue.enqueue(0);
		queue.enqueue(200);
		queue.print();
	}

}
