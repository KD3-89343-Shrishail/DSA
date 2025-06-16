package assignment3;

public class Assignment3_Q4 {

	public static void main(String[] args) {
	
		Linklist l = new Linklist();
//		l.addLast(10);
//		l.addLast(20);
//		l.addLast(30);
		l.addSorted(10);
		l.addSorted(20);
		l.addSorted(40);
		l.addSorted(2);
		l.addLast(50);
		l.display();
	}

}
