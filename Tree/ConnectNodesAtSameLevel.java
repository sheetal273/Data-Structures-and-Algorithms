import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ConnectNodesAtSameLevel {

	Node root;
	
	public static void main(String[] args) {
		
	ConnectNodesAtSameLevel tree = new ConnectNodesAtSameLevel();
	
	tree.root = new Node(1);
	tree.root.left = new Node(2);
	tree.root.right = new Node(3);
	
	tree.root.left.left = new Node(4);
		
	LevelOrderTraversal(tree.root);
	
	}


	public static void connect(Node p)
     {
         	Queue<Node> queue = new LinkedList<Node>();
		      queue.add(root);
		      Node node = null;
		      while(!queue.isEmpty()) {
			
		      	int n = queue.size();
			
		      	for(int i =0; i< n;i ++) {
				
			      	Node prev = node;
			      	node = queue.poll();
			
				
			      	if(i > 0) {
			      		prev.nextRight = prev;
			      	}
			
			
			    	if(node.left != null) {
				    	queue.add(node.left);
					
				    }
				    if(node.right != null) {
				    	queue.add(node.right);
			    	}
				
				
			}
			node.nextRight = null;
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
