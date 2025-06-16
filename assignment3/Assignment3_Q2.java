package assignment3;

public class Assignment3_Q2 {

	public static void main(String[] args) {

		Linklist l = new Linklist();
		l.addFirst(10);
		l.addLast(20);
		l.addLast(30);
		l.addBeforeNode(15, 10);
		l.display();
	}

}
