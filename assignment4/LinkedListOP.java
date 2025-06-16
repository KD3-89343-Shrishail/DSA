package assignment4;

//import assignment.Linklist.Node;

public class LinkedListOP {
	static class Node{
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int value) {
			data = value;
			next = null;
			prev = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public LinkedListOP() {
		head = tail = null;
	}
	
	public void addFirst(int value) {
		Node node = new Node(value);
		if(head == null) {
			head = tail = node;
		}else {
			node.next = head;
			head.prev = node;
			head = node;
		}
	}
	private void addLast(int value) {
		Node node = new Node(value);
		if(head == null) {
			head = tail = node;
		}else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	}
	
	private void deleteLast() {
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
			Node temp = new Node(head.data);
			
			head = null;
		}
		head = head.next;
	}
	
	public void display() {
		if(head == null) {
			return;
		}
		Node trav = head;
		while(trav != null) {
			System.out.print(trav.data+" ");
			trav = trav.next;
		}
	}
}
