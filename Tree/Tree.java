package Tree;

import java.util.ArrayList;
import java.util.Stack;

public class Tree {

	Node root;
	
	static class Node{
		int key;
		Node left, right;
		
		public Node(int item) {
			
			this.key = item;
			left = right = null;
			
		}
	}
	
	public void inOrderTraversal(Node node) {
		
		if(node != null) {
		inOrderTraversal(node.left);
		System.out.print(" " +node.key);
		inOrderTraversal(node.right);
		}
	}

	public int[] inOrderIterative(Node node) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Node curr = node;
		int[] result = null;
		
		if(node == null) {
			return result;
		}
		Stack<Node> stack = new Stack<Node>();
		
		Node n = node;
		while(!stack.isEmpty() || curr!=null) {
			
			if(n!=null) {
				
				stack.push(n);
				curr = curr.left;
				//arr.add(n.key);
			}else {
				Node n1 = stack.peek();
				arr.add(n.key);
				stack.pop();
				//stack.pop();
				curr = n.right;
			}
			
		}
		result = new int[arr.size()];
		for(int k=0;k<arr.size();k++) {
			result[k++] = arr.get(k);
		}
		return result;
	}
	public static void main(String[] args) {
		
		int data = 1;
		Tree tree = new Tree();
		tree.root = new Node(data);
		tree.root.right = new Node(2);
		tree.root.right.left = new Node(3);
	/*	
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		*/
		tree.inOrderTraversal(tree.root);
		tree.inOrderIterative(tree.root);
	}
}
