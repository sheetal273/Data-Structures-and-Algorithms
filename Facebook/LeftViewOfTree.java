import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class VisibleNodes {

	public static void main(String args[]) {
	
		Node1 node = new Node1(1);
		node.left = new Node1(2);
		node.right = new Node1(3);
		node.right.right = new Node1(4);
		node.right.right.left = new Node1(5);
		node.right.right.left.right = new Node1(5);
		node.left.right = new Node1(3);
		
		
		
		Node1 root_1 = new Node1(8); 
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
	}
	
	public static ArrayList<Integer> visibleNodes2(Node1 root) {
	    // Write your code here
		
		if(root == null) {
			return null;
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		Queue<Node1> queue = new LinkedList<Node1>();
		queue.add(root);
		int count = 0;
		while(!queue.isEmpty()) {
			

			int size = queue.size();
			int i = 0;
			while(i++ < size) {
				
				Node1 node = queue.poll();
				if(i == 1 && node!=null) {
			//		System.out.print(" =>" +  node.data);
					list.add(node.data);
					count++;
				}
				

				if(node.left != null) {
					queue.add(node.left);
				}
				if(node.right != null) {
				
					queue.add(node.right);
				}
			}
				
		}
		    
		return list;
	  }
	}
