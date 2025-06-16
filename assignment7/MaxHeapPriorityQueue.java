package assignment7;

import java.util.ArrayList;

public class MaxHeapPriorityQueue {
	private ArrayList<Integer> heap;

	public MaxHeapPriorityQueue() {
		heap = new ArrayList<>();
	}

	public void insert(int val) {
		heap.add(val);
		int i = heap.size() - 1;

		// Bubble up
		while (i > 0 && heap.get((i - 1) / 2) < heap.get(i)) {
			// Swap with parent
			int temp = heap.get(i);
			heap.set(i, heap.get((i - 1) / 2));
			heap.set((i - 1) / 2, temp);
			i = (i - 1) / 2;
		}
	}

	public int extractMax() {
		if (heap.isEmpty())
			throw new IllegalStateException("Heap is empty!");

		int max = heap.get(0);
		int last = heap.remove(heap.size() - 1);
		if (!heap.isEmpty()) {
			heap.set(0, last);
			heapify(0);
		}
		return max;
	}

	private void heapify(int i) {
		int size = heap.size();
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;

		if (left < size && heap.get(left) > heap.get(largest))
			largest = left;
		if (right < size && heap.get(right) > heap.get(largest))
			largest = right;

		if (largest != i) {
			int temp = heap.get(i);
			heap.set(i, heap.get(largest));
			heap.set(largest, temp);
			heapify(largest);
		}
	}

	public boolean isEmpty() {
		return heap.isEmpty();
	}

	public void printHeap() {
		System.out.println(heap);
	}
}
