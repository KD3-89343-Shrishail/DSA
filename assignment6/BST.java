package assignment6;
import java.util.Queue;
import java.util.Stack;
import java.util.LinkedList;
public class BST {

	static class Node{
		private int data;
		private Node left, right;
		
		public Node(int value) {
			data = value;
			left = right = null;
		}
	}
	
	private Node root;
	
	public BST() {
		root = null;
	}
	
	public boolean isEmpty() {
		return root == null;
	}
	
	public void addNode(int key) {
		Node nn = new Node(key);
		if(root == null) {
			root = nn;
		}else {
			Node trav = root;
			while(true) {
			if(key < trav.data) {
				if(trav.left == null) {
					trav.left = nn;
					break;
				}else {
					trav = trav.left;
				}
			}else {
				if(trav.right == null) {
					trav.right = nn;
					break;
				}else {
					trav = trav.right;
				}
			}
			}
		}
	}
	
	private boolean BinarySearch(Node root, int key) {
//		1. find the key and par
		if(root == null) {
			return false;
		}
			if(root.data == key) {
				return true;
			}
			if(key < root.data) {
				 return BinarySearch(root.left, key);
			}else {
				 return BinarySearch(root.right, key);
			}
		}
	public boolean BSRecursive(int key) {
		Node trav = root;
		return BinarySearch(trav, key);
	}
	
	private Node Successor(int key) {
		Node trav = root;
		if(trav == null) {
			return null;
		}
		while(trav != null){
			if(trav.data == key) {
				 break;
			}
			if(key < trav.data) {
				trav = trav.left;
			}else {
				trav = trav.right;
			}
		}
		if(trav == null) {
			return null;
		}
		if(trav.right == null) {
			return trav.right;
		}
		Node suc = trav.right;
		while(suc.left != null) {
			suc = suc.left;
		}
		return suc;
	}
	public void successor(int key) {
		Node node =  Successor(key);
		System.out.println(node.data);
	}
	public void display() {
		Node trav = root;
		Inorder(trav);
		System.out.println("---------------------");
	}
	
	public void depth(int key) {
		int depth = depth(root, key);
		System.out.println("depth "+ depth);
	}
	
	public void level() {
		Node trav = root;
		Queue<Node> q = new LinkedList<>();
		if(trav == null) {
			return ;
		}
		q.add(trav);
		System.out.println("BFS Traversal : ");
		while(!q.isEmpty()) {
			Node ele = q.remove();
			System.out.println(ele.data);
			
			if(ele.left != null) {
				q.add(ele.left);
			}
			if(ele.right != null) {
				q.add(ele.right);
			}
		}
		System.out.println("");
		
	}
	
	
	public void DFSlevel() {
		Node trav = root;
		Stack<Node> q = new Stack<>();
		if(trav == null) {
			return ;
		}
		q.add(trav);
		System.out.println("BFS Traversal : ");
		while(!q.isEmpty()) {
			Node ele = q.pop();
			System.out.println(ele.data);
			
			if(ele.left != null) {
				q.push(ele.left);
			}
			if(ele.right != null) {
				q.push(ele.right);
			}
		}
		System.out.println("");
		
	}
	
	private int depth(Node root, int key) {
		Node trav = root;
		if(trav == null) {
			return -1;
		}
		int dist = -1;
		if((trav.data == key) || (dist=depth(root.left, key)) >= 0 || (dist=depth(root.right, key)) >= 0) {
			return dist+1;
		}
		return dist;
	}
	private void Inorder(Node root) {
		if(root == null) {
			return;
		}
		
		Inorder(root.left);
		System.out.print(root.data+" ");
		Inorder(root.right);
	}
	
	
}
