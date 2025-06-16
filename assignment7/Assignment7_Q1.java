package assignment7;

public class Assignment7_Q1 {

	public static void main(String[] args) {
		MaxHeapPriorityQueue pq = new MaxHeapPriorityQueue();
		pq.insert(20);
		pq.insert(15);
		pq.insert(30);
		pq.insert(40);

		System.out.println("Priority Queue (Max Heap):");
		pq.printHeap();

		System.out.println("Extract Max: " + pq.extractMax());
		pq.printHeap();
	}
}
