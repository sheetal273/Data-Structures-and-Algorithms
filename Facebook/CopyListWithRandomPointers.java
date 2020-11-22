/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node node) {
        
        Node head = node;
		 Node clone = null;
		 
		 if(head == null) {
			 return null;
		 }
		 
		 while(head != null) {
			 
			 Node newNode = new Node(head.val);
			 newNode.next = head.next;
	
			 head.next = newNode;		 
			 head = head.next.next;
		 }
		 
		 head = node;
		 while(head != null) {
			 
			 if(head.random != null) {
				 head.next.random = head.random.next;
			 } else {
				head.next.random = null;
			 }
			 head = head.next.next;
		 }
		 
		 head = node;
		 clone = head.next;

		 Node copy = clone;
		 
		 while(head != null && clone != null) {
			
			 //Restoring original list 
			 
			head.next = (head.next!=null) ? head.next.next : head.next;
			clone.next = (clone.next!=null) ? clone.next.next : clone.next;
			
			head = head.next;
			clone = clone.next;
			 
		 }
		 
		 return copy;
     }
}
