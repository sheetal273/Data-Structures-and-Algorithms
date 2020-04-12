
public class TreeDiameter {


	int pathLength =0;
	 public int diameterOfBinaryTree(Node root) {
 
	 if(root == null) {
		 return 0;
	 }
	int lheight = height(root.left);
	int rheight = height(root.right);
	

	
	pathLength = Math.max(pathLength,lheight+rheight) ;

    diameterOfBinaryTree(root.left);
	diameterOfBinaryTree(root.right);
    
    return pathLength;
 }
	 
	public int height(Node root) {
		
		if(root == null) {
			return 0;
		}
		return 1 + Math.max(height(root.left), height(root.right));
	}
	 
	public static void main(String[] args) {
		
		TreeDiameter obj = new TreeDiameter();
		
		Node root = new Node(1);
		
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
	//	Node n6 = new Node(1);
	//	Node n7 = new Node(1);
		
		root.left = n2;
		root.right = n3;
		root.left.left = n4;
		root.left.right = n5;
		
		System.out.println(" Diameter : "+ obj.diameterOfBinaryTree(root));
	}
}


class Node {
	int val;
	Node left;
	Node right;
	
	Node(int x){
		this.val = x;
	}
	
}
