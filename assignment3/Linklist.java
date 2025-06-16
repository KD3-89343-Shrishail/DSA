package assignment3;

//import test.Linklist.Node;

public class Linklist {
	static class Node{
		private int data;
		private Node next;
		public Node(int value) {
			data = value;
			next = null;
		}
	}
	private Node head;
//	private Node tail;
	public Linklist() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addFirst(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}else {
		newNode.next = head;
		head = newNode;
		}
	}
	
	public void addLast(int value) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}else {
		Node trav = head;
		while(trav.next != null) {
			trav = trav.next;
		}
		trav.next = newNode;
		}
	}
	
	public void deleteLast() {
		if(head == null) {
			return;
		}
		Node trav = head;
		if(trav.next == null) {
			head = null;
		}
		while(trav.next != null && trav.next.next != null) {
			trav = trav.next;
		}
		trav.next = null;
	}
	
	public void deleteFirst() {
		if(head == null) {
			return;
		}
		if(head.next == null) {
			head = null;
		}
		head = head.next;
	}
	
	public void display() {
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
	}
	
	public void addPosition(int value, int pos) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}
		if(pos <= 1) {
			newNode.next = head;
			head = newNode;
		}else {
		Node trav = head;
		for(int i = 1; i < pos-1; i++) {
			trav = trav.next;
		}
		newNode.next = trav.next;
		trav.next = newNode;
		}
	}
	
	public void addAfterNode(int value, int data) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}else {
		Node trav = head;
		while(trav.next != null) {
			if(trav.data == data) {
				break;
			}
			trav = trav.next;
		}
		newNode.next = trav.next;
		trav.next = newNode;
	}
	}
	
	public void addBeforeNode(int value, int data) {
		Node newNode = new Node(value);
		if(head == null) {
			head = newNode;
		}else if(head.data == data) {
			newNode.next = head;
			head = newNode;
		}
		else {
		Node trav = head;
		Node prev = null;
		while(trav.next != null) {
			if(trav.data == data) {
				break;
			}
			prev = trav;
			trav = trav.next;
		}
		newNode.next = trav;
		prev.next = newNode;
	}
	}
	
	protected void reverseList(Node trav) {
		if(trav == null) {
			return;
		}
		reverseList(trav.next);
		System.out.print(trav.data+" ");
	}
	
	public void reverse() {
		System.out.println("Printing the linked list in reverse order");
		Node trav = head;
		reverseList(trav);
	}
	
	
	public void addSorted(int value) {
	    Node newNode = new Node(value);

	    // Case 1: Empty list or insert before head
	    if (head == null || value < head.data) {
	        newNode.next = head;
	        head = newNode;
	        return;
	    }

	    // Case 2: Insert in between or at end
	    Node current = head;
	    while (current.next != null && current.next.data < value) {
	        current = current.next;
	    }

	    newNode.next = current.next;
	    current.next = newNode;
	}

}
