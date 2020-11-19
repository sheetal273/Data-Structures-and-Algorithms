
public class MinimumDepth {

	public static void main(String args[]) {
		
		Node node = new Node(1);
		node.left = new Node(2);
		node.right = new Node(3);
		node.right.right = new Node(4);
		node.right.right.left = new Node(5);
		node.right.right.left.right = new Node(5);
		node.left.right = new Node(3);
	//	node.left.right.left = new Node(3);
		
		System.out.println("find depth: "+ minDepth(node));
	}
	
	static int minDepth(Node root)
	{
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
	
		if(root.left== null) {
			return minDepth(root.right)+1;
		}
		

		if(root.right== null) {
			return minDepth(root.left)+1;
		}
	
		return 1+ Math.min(minDepth(root.left), minDepth(root.right));
	}
}

class Node{
	
    int data;
    Node left;
    Node right;
    
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
    
}



