
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	Node root;
	
	public static void main(String[] args) {
		
	LevelOrderTraversal tree = new LevelOrderTraversal();
	
	tree.root = new Node(1);
	tree.root.left = new Node(2);
	tree.root.right = new Node(3);
	
	tree.root.left.left = new Node(4);
	
	LevelOrderTraversalOfTree(tree.root);
		
	}



	public static void LevelOrderTraversalOfTree(Node root) {
		
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			Node node = queue.poll();
			System.out.print(" " + node.data);
			
			if(node.left != null) {
				queue.add(node.left);
			}
			if(node.right != null) {
				queue.add(node.right);
			}
		}
		
	}
	  
}

class Node{
    int data;
    Node left;
    Node right;
    Node nextRight;
    
    Node(int data){
        this.data = data;
        left=null;
        right=null;
        nextRight = null;
    }
}
