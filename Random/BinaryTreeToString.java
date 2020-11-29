import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class VisibleNodes {

	static StringBuilder res = new StringBuilder();
	public static void main(String args[]) {
	
	/*	Node1 node = new Node1(1);
		node.left = new Node1(2);
		node.right = new Node1(3);
		node.right.right = new Node1(4);
		node.right.right.left = new Node1(5);
		node.right.right.left.right = new Node1(5);
		node.left.right = new Node1(3);
		*/
		
		Node1 node1 = new Node1(1);
		node1.left = new Node1(2);
		node1.left.right = new Node1(4);
		node1.right = new Node1(3);
		
		
		/*		Node1 root_1 = new Node1(8); 
		    root_1.left = new Node1(3); 
		    root_1.right = new Node1(10); 
		    root_1.left.left = new Node1(1); 
		    root_1.left.right = new Node1(6); 
		    root_1.right.right = new Node1(14); 
		    root_1.left.right.left = new Node1(4); 
		    root_1.left.right.right = new Node1(7); 
		    root_1.right.right.left = new Node1(13); 
	
		
		
		 Node1 root_2 = new Node1(10); 
		    root_2.left = new Node1(8);
		    root_2.right = new Node1(15);
		    root_2.left.left = new Node1(4);
		    root_2.left.left.right = new Node1(5);
		    root_2.left.left.right.right = new Node1(6);
		    root_2.right.left = new Node1(14);
		    root_2.right.right = new Node1(16);
		    
		    

			System.out.println(visibleNodes2(node));

			System.out.println(visibleNodes2(root_1));
			System.out.println(visibleNodes2(root_2));
		*/
		
		System.out.println(tree2str(node1));
	}
	
	
	 public static String tree2str(Node1 root) {
	 
			 if(root == null) {
				 return "";
			 }
	
			
			 if(root.left == null && root.right == null) {
				 res.append(root.data);
			 }
			 
			 else if(root.left == null && root.right != null) {
				 res.append(root.data + "()").append("(");
				 tree2str(root.right);
				 res.append(")");
			 }
			 else if(root.left !=null && root.right == null) {
			 
				 res.append(root.data + "(");
				 tree2str(root.left);
				 res.append(")");
				 
			 } else {
				
				 res.append(root.data + "(");
				 tree2str(root.left);
				 res.append(")");
				 res.append("(");
				 tree2str(root.right);
				 res.append(")");
			 }
		 
		 return res.toString();
	 }
	 
