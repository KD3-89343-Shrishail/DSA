package assignment6;

public class Assignment6 {
	public static void main(String[] args) {
		BST tree = new BST();
		tree.addNode(10);
		tree.addNode(20);
		tree.addNode(18);
		tree.addNode(15);
		tree.addNode(30);
		tree.addNode(40);
		tree.addNode(50);
		tree.addNode(2);
		tree.addNode(3);
		tree.addNode(5);
//		tree.display();
//		tree.successor(10);
//		tree.depth(50);
		tree.level();
		tree.DFSlevel();
//		System.out.println(node);
	}
	
}