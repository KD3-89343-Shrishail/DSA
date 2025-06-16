package assignment4;

//Write a menu driven program to perform operations on any linked list. Also provide option for undo. At
//any moment if you do undo, last operation performed on linked list should rollback. Your application
//should support at least few undo operations
public class Assignment4 {

	public static void main(String[] args) {
		LinkedListOP l = new LinkedListOP();
		l.addFirst(10);
		l.addFirst(5);
		l.addFirst(20);
//		l.deleteFirst();
		l.display();
	}

}
